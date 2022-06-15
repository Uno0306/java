package blood.transfusion.contoller;

import java.sql.SQLException;
import java.util.ArrayList;

import blood.transfusion.dto.BTProjectDTO;
//import blood.transfusion.dto.BTProjectDTO;
import blood.transfusion.dto.DonorDTO;
import blood.transfusion.dto.RecipientDTO;
import blood.transfusion.exception.NotExistException;
//import blood.transfusion.model.BTProjectDAO;
import blood.transfusion.model.BTService;
import blood.transfusion.model.DonorDAO;
import blood.transfusion.model.RecipientDAO;
import blood.transfusion.view.RunningEndView;
//import blood.transfusion.view.RunningSuccessView;
import blood.transfusion.view.RunningSuccessView;

public class BTController {
	private static BTController instance = new BTController();
	private BTService service = BTService.getInstance();
	
	private BTController() {}
	
	public static BTController getInstance() {
		return instance;
	}
	
	// 모든 프로젝트 검색
	public void allBTProjects(){
		try{
			RunningEndView.projectListView(service.getAllBTProjects());
			RunningSuccessView.showSuccess("모든 프로젝트 검색 성공");
		}catch(SQLException s){
			s.printStackTrace();
			RunningEndView.showError("모든 프로젝트 검색시 에러 발생");
		}
	
	}
	
	// 특정 프로젝트 검색 - finish
	public void getBTProject(String btProjectId) {
		try {
			RunningEndView.projectView(service.getBTProject(btProjectId));
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (NotExistException e) {
			System.out.println("검색하신 프로젝트가 없습니다.");
		}
	}
	
	// 새로운 프로젝트 저장 로직
		public void addAllBTProject(DonorDTO donor, RecipientDTO recipient, BTProjectDTO btProject) {
			try {
				service.addDonor(donor);
				service.addRecipient(recipient);
				service.addBTProject(btProject);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		public void addAllBTProject(BTProjectDTO btProject) {
			try {
				service.addBTProject(btProject);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
	// 특정 프로젝트 업데이트 - finish
	public void updateBTProject(String btProjectId, String btProjectContent) {
		try {
			RunningEndView.updateContentView(service.updateBTProject(btProjectId, btProjectContent));
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (NotExistException e) {
			System.out.println("검색하신 프로젝트가 없습니다.");
		}
	}
	
	// 헌혈자 목적 업데이트
	public void updateBTProjectdonor(String donorId, String purposeDonation) {
		try {
			RunningEndView.updateDonorView(service.updateDonor(donorId, purposeDonation));
			RunningEndView.updateDonorView(service.getDonor(donorId));
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (NotExistException e) {
			System.out.println("검색한  헌혈자가 미 존재합니다.");
		}
	}
	
	// 수혈자 정보 업데이트
	public void updateBTProjectRecepient(String recipientId, String purposeTransfusion) {
		try {
			RunningEndView.updateRecepientView(service.updateRecipient(recipientId, purposeTransfusion));
			RunningEndView.updateRecepientView(BTService.getRecipient(recipientId));
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (NotExistException e) {
			System.out.println("검색한  수혈자가 미 존재합니다.");
		}
	}
	
	// 특정 프로젝트 삭제
	public void deleteBTprojectRecive(String btProjectId) {
		try {
			service.deleteBTProject(btProjectId);
		} catch (SQLException | NotExistException e) {
			e.printStackTrace();
		}
	}

	
	
	// 모든 헌혈자 검색 로직
	public static ArrayList<DonorDTO> getAllDonors(){
		ArrayList<DonorDTO> allProject = null;
		try{
			RunningEndView.projectListView(DonorDAO.getAllDonors());
			RunningSuccessView.showSuccess("모든  헌혈자 검색 성공");
		}catch(SQLException s){
			s.printStackTrace();
			RunningEndView.showError("모든  헌혈자 검색시 에러 발생");
		}
		return allProject;
	}
	
	// 모든 수혈자 검색 로직
	public static ArrayList<RecipientDTO> getAllRecipients(){
		ArrayList<RecipientDTO> allProject = null;
		try{
			RunningEndView.projectListView(RecipientDAO.getAllRecipients());
			RunningSuccessView.showSuccess("모든  수혈자 검색 성공");
		}catch(SQLException s){
			s.printStackTrace();
			RunningEndView.showError("모든  수혈자 검색시 에러 발생");
		}
		return allProject;
	}
}
