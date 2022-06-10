package view;

import model.domain.Student;

public class EndView {
	// 모든 데이터 출력
	public static void printAll(Student[] all) {
		for(int i = 0; i < all.length; i++) {
			if(all[i] != null) {
			System.out.println(all[i]);
			}
		}
	}
	
	// 한명 출력
	public static void printOne(Student student) {
		if(student != null) {
			System.out.println(student);
		}else {
			System.out.println("검색 대상이 없습니다");
		}
	}
	
	public static void printSuccess(String msg) {
		System.out.println(msg);
	}

	public static void printFail(String msg) {
		System.out.println(msg);
	}
}





