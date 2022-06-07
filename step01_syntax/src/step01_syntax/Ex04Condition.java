// Java 조건문
/* 조건문 : 주어진 조건이 참일 경우, 기능 수행
 * 1) if문
 * 		if(조건식) {
 * 			수행 코드;  
 * 		}else if(조건식2) {
 * 			수행 코드2;
 * 		}else {
 * 			수행 코드3;
 * 		}
 * 
 * 2) switch/case문
 * 	 	switch(변수명) {
 * 			case 조건1:
 * 				수행 코드;
 * 			...
 * 			default:
 * 				기본 수행 코드;
 * 		}
 */

package step01_syntax;


public class Ex04Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String id = "admin";
		if("admin".equals(id)) {
			System.out.println("접속 성공");
		}else if ("admin2".equals(id)) {
			System.out.println("접속 성공");
		}else {
			System.out.println("접속 실패");
		}
		
		
		int month = 1;
		switch (month) {
		case 1:
			System.out.println(month+"월입니다.");
			break;
		case 2:
			System.out.println(month+"월입니다.");
			break;
		case 3:
			System.out.println(month+"월입니다.");
			break;

		default:
			System.out.println("해당하는 월이 없습니다.");
			break;
		}
		
		
	}

}
