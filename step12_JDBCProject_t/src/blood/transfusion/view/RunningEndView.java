package blood.transfusion.view;

import java.util.ArrayList;

import blood.transfusion.contoller.BTController;
import blood.transfusion.dto.BTProjectDTO;
import blood.transfusion.dto.DonorDTO;
import blood.transfusion.dto.RecipientDTO;

public class RunningEndView {
	static BTController controller = BTController.getInstance();
	//모든 프로젝트 출력
	public static void projectListView(ArrayList allProject){
		int length = allProject.size();
		if( length != 0 ){
			for(int index = 0; index < length; index++){			
				System.out.println("검색정보 " + (index+1) + " - " + allProject.get(index));
			}
		}
	}
	
	//특정 프로젝트 출력 
	public static void projectView(BTProjectDTO project){
		System.out.println(project);		
	}
	
	// 프로젝트 정보 수정 및 보여주기
	public static void updateContentView(boolean check) {
		if (check) {
			System.out.println("프로젝트 정보가 수정되었습니다.");
		} else {
			System.out.println("프로젝트 정보가 수정되지 않았습니다.");
		}
		controller.allBTProjects();
	}

	// 헌혈자 정보 수정
	public static void updateDonorView(boolean check) {
		if (check) {
			System.out.println("헌혈자 정보가 수정되었습니다.");
		} else {
			System.out.println("헌혈자 정보가 수정되지 않았습니다.");
		}
	}

	public static void updateDonorView(DonorDTO donor) {
		System.out.println(donor);
	}
	
	// 수혈자 정보 수정
	public static void updateRecepientView(boolean check) {
		if (check) {
			System.out.println("수혈자 정보가 수정되었습니다.");
		} else {
			System.out.println("수혈자 정보가 수정되지 않았습니다.");
		}
	}
	
	public static void updateRecepientView(RecipientDTO recipient) {
		System.out.println(recipient);
	}
	
	
	
	
	// 모든 DTO 정보 출력하는 메소드
	public static void allView(Object object){
		System.out.println(object);
		
	}
	
	
	//예외 상황 출력
	public static void showError(String message){
		System.out.println(message);		
	}
}
