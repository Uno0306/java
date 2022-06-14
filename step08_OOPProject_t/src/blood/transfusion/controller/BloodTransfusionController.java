package blood.transfusion.controller;

import java.util.ArrayList;

import blood.transfusion.dto.BloodTransfusionProject;
import blood.transfusion.dto.People;
import blood.transfusion.exception.NotExistException;
import blood.transfusion.exception.ProjectNoneException;
import blood.transfusion.service.BloodTransFusionProjectService;
import blood.transfusion.view.EndView;

public class BloodTransfusionController {
	private static BloodTransfusionController instance = new BloodTransfusionController();
	private BloodTransFusionProjectService service = BloodTransFusionProjectService.getInstance();

	private BloodTransfusionController() {}

	public static BloodTransfusionController getInstance() {
		return instance;
	}

	
	// 모든 프로젝트 검색
	public void projectListView() {
		ArrayList<BloodTransfusionProject> projectList = service.getAllProjects();
		EndView.projectListView(projectList);
	}
	
	// 특정 프로젝트 검색_
	public void projectView(String projectName)  {
		try{
			EndView.projectView(service.getProject(projectName));
		}catch (ProjectNoneException e) {
			System.out.println("검색 요청하신 프로젝트는 존재하지 않습니다");
		}
	}

	// 새로운 프로젝트 저장
	public void insertProject(BloodTransfusionProject newProject) {
		service.projectInsert(newProject);
	}
	
	// 존재하는 프로젝트 수정_
	public void updateProject(String projectName, People people) {
		try {
			service.projectUpdate(projectName, people);
		} catch (NotExistException e) {
			System.out.println("발생된 상황 : 수정하고자 하는 Project가 존재하지 않습니다");
		}
	}

	// 이름으로 검색한 프로젝트 삭제_
	public void deleteProject(String projectName) {
		try {
			// ver 1
			service.projectDelete(projectName);
			System.out.println("해당 Project가 삭제되었습니다.");
			EndView.projectListView(service.getAllProjects());
		} catch (NotExistException e) {
			System.out.println("발생된 상황 : 삭제하고자 하는 Project가 존재하지 않습니다");
		}
	}
}




























