package blood.transfusion.service;

import java.util.ArrayList;

import blood.transfusion.dto.BloodTransfusionProject;
import blood.transfusion.dto.People;
import blood.transfusion.dto.Recipient;
import blood.transfusion.exception.NotExistException;
import blood.transfusion.model.BloodTransfusionVirtualDB;

public class BloodTransFusionProjectService {
	private static BloodTransFusionProjectService instance = new BloodTransFusionProjectService();
	private BloodTransfusionVirtualDB projectVirtualData = BloodTransfusionVirtualDB.getInstance();

	private BloodTransFusionProjectService(){}
	public static BloodTransFusionProjectService getInstance(){
		return instance;
	}
	
	// 모든 프로젝트 반환
	public ArrayList<BloodTransfusionProject> getAllProjects(){
		
		return projectVirtualData.getProjectList();
	}
	
	// 프로젝트 검색_
	@SuppressWarnings("unused")
	public BloodTransfusionProject getProject(String projectName) {
		BloodTransfusionProject project = null;
		
		// ver 1
		ArrayList<BloodTransfusionProject> allArrayList= projectVirtualData.getProjectList();
		for(int i=0; i<allArrayList.size(); i++) {
			if(projectName.equals(allArrayList.get(i).getBtProjectName())) {
//				project = allArrayList.get(i);
				return allArrayList.get(i);
			}else {
				return null;
			}
		}
		return null;
		
		// ver 2
//		ArrayList<BloodTransfusionProject> allArrayList= projectVirtualData.getProjectList();
//		allArrayList
//			.stream()
//			.filter(v -> v.getBtProjectName().matches(projectName));
//		System.out.println(allArrayList); - error
//		return null; - error
		
	}

	// 새로운 프로젝트 추가
	public void projectInsert(BloodTransfusionProject newProject) {
		projectVirtualData.insertProject(newProject);
	}
	
	// 프로젝트 수정 - 프로젝트 명으로 현혈자 혹은 수혈자 수정_
	public void projectUpdate(String projectName, People people) throws NotExistException{
		if(getProject(projectName) != null) {
			getProject(projectName).setRecipient((Recipient)people);
		}else {
			throw new NotExistException();
		}
	}
	
	// 프로젝트 삭제_
	public void projectDelete(String projectName) throws NotExistException{
		// ver 1
		ArrayList<BloodTransfusionProject> allArrayList= projectVirtualData.getProjectList();
		BloodTransfusionProject project = null;

		for(int i=0; i<allArrayList.size(); i++) {
			if(projectName.equals(allArrayList.get(i).getBtProjectName())) {
				project = allArrayList.get(i);
			}
		}
		
		if(project != null) {
			projectVirtualData.deleteProject(project);
		}else {
			System.out.println("해당 Project가 없습니다.");
		}
		
		// ver 2
//		System.out.println("해당 프로젝트가 삭제되었습니다.");
//		 getAllProjects()
//			.stream()
//			.filter(v -> !(v.getBtProjectName().matches(projectName)))
//			.forEach(System.out::println);
	
		 
	}	
}
