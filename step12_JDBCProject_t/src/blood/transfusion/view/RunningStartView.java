package blood.transfusion.view;

import blood.transfusion.contoller.BTController;
import blood.transfusion.dto.BTProjectDTO;
import blood.transfusion.dto.DonorDTO;
import blood.transfusion.dto.RecipientDTO;

public class RunningStartView {

	public static void main(String[] args) {
		BTController controller = BTController.getInstance();
		
		System.out.println("=====모든 프로젝트 검색=====");
		controller.allBTProjects();
		System.out.println();
		
		System.out.println("=====특정 프로젝트 검색=====");
		controller.getBTProject("bt1");
		System.out.println();
		
		// 새로운 수혈자랑 새로운 헌혈자 들어가면 터져서 새로 넣어야한다. (참조 무결성 위배 Donor, Recipient 각 테이플 pk,
		// project 테이블에서 fk)/ 기존은 냅둬도된다.

		System.out.println("=====새로운 프로젝트 저장=====");
		// 추가
		controller.addAllBTProject(new DonorDTO("donor4", "헌혈4", 43, "M", "AB-", "취미"),
				new RecipientDTO("Recipient4", "수혈4", 43, "M", "AB-", "취미"),
				new BTProjectDTO("A-", "bt4", "donor4", "recipient4", "AB-형간의 수혈"));

		// 정보 가져와 추가
		controller.addAllBTProject(new BTProjectDTO("A-", "bt5", "donor3", "recipient2", "O-B형간의 수"));
		System.out.println();
		
		System.out.println("=====프로젝트 정보 수정=====");
		controller.updateBTProject("bt1", "A-형간의 수혈");
		System.out.println();
		
		System.out.println("=====헌혈자 정보 수정=====");
		controller.updateBTProjectdonor("donor1", "재미");
		System.out.println();
		
		System.out.println("=====수혈자 정보 수정=====");
		controller.updateBTProjectRecepient("recipient1", "빈혈");
		System.out.println();
		

		System.out.println("=====bt_project_id로 프로젝트 삭제 ======");
//		controller.deleteBTprojectRecive("bt5");
//		controller.deleteBTprojectRecive("asds");
		System.out.println();
		
		
		System.out.println("=====모든 헌혈자 검색=====");
		BTController.getAllDonors();
		System.out.println();

		System.out.println("=====모든 수혈자 검색=====");
		BTController.getAllRecipients();
		System.out.println();
		

		
	}
}
