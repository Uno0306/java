/* 참조 타입
 *  - 변수 -- 스택(stack), 객체 -- 힙(heap) 영역에서 생성
 *  - 기본값 : null
 *  	- 참조할 객체 없을 경우, NullPointerException(NPE) 발생
 */
package step01_syntax;

public class Ex06Reference {

	public static void main(String[] args) {
		// 문자열 (String)
		// ==, equals
		
		String str1 = "Java";
//		System.out.println(str1);
//		System.out.println(str1.hashCode());
		
		str1 = null;
//		System.out.println(str1);
//		System.out.println(str1.hashCode());
		

		/* 배열(Array) : 데이터 값 여러가지를 한 개의 변수에 대입
		 * - 구조 : 타입[] 변수명 = {요소1, 요소2, ...};
		 * - 특징 : 길이(사용 가능한 데이터 값의 개수)가 고정
		 * - 종류 : 1차원, 다차원 배열
		 */
		
		// 배열 선언 및 초기화
		int[] arr1 = {1, 2, 3};
		String[] arr2 = {"one", "two", "three"};
		
		int[] arr3;
//		arr3 = {4, 5, 6};
		arr3 = new int[] {4, 5, 6};
		
		int[] arr4 = new int[3];
		
		// 배열값 접근 : index - 0부터 시작
		System.out.println(arr1[0]);
		System.out.println(arr1[3]);
		System.out.println("-----");
		
		// 배열의 길이 : length
		System.out.println(arr1.length);
		
		// 배열의 데이터 값?
		
		

		
	}

}