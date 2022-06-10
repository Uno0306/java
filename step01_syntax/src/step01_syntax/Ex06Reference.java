/* 참조 타입
 *  - 변수 -- 스택(stack), 객체 -- 힙(heap) 영역에서 생성
 *  - 기본값 : null
 *  	- 참조할 객체 없을 경우, NullPointerException(NPE) 발생
 */
package step01_syntax;

import java.util.Arrays;

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
//		System.out.println(arr1[0]);
//		System.out.println(arr1[3]);
//		System.out.println("-----");
		
		// 배열의 길이 : length
//		System.out.println(arr1.length);
		
		// 배열의 데이터 값?
//		System.out.println(arr1);
		
		// step01
//		for (int i = 0; i < 3; i++) {
//			System.out.println(arr1[i]);
//		}
		
		// step02
//		for (int i = 0; i < arr1.length; i++) {
//			System.out.println(arr1[i]);
//		}		
		
		// step03
//		for (int i : arr1) {
//			System.out.println(arr1[i-1]);
//		}
		
		// 얕은 복사
//		int[] arr5 = {1, 2, 3};
//		int[] arr6 = arr5;
//		
//		System.out.println(arr6[0]);
//		System.out.println(arr5[0]);
//		arr6[0] = 10;
//		System.out.println(arr6[0]);
//		System.out.println(arr5[0]);

		
		// 깊은 복사
		int[] arr7 = {1, 2, 3};
		int[] arr8 = new int[arr7.length];
		for (int i = 0; i < arr7.length; i++) {
			arr8[i] = arr7[i];
		}
//		
//		System.out.println(arr8[0]);
//		System.out.println(arr7[0]);
//		arr8[0] = 10;
//		System.out.println(arr8[0]);
//		System.out.println(arr7[0]);

		
		// etc
//		int [] arr9 = arr7.clone();
//		arr9[0] = 10;
//		System.out.println(arr7[0]);
//		
		
		int[] arr10 = Arrays.copyOf(arr7, arr7.length);
//		arr10[0] = 10;
//		System.out.println(arr7[0]);

		
		// 2차원 배열
		int[][] arr11 = new int[3][4];
		/*	arr11 배열의 구조
		 * [
		 * 	[ arr11[0][0], arr11[0][1], arr11[0][2] ,arr11[0][3] ],
		 * 	[ arr11[1][0], arr11[1][1], arr11[1][2] ,arr11[1]3] ],
		 * 	[ arr11[2][0], arr11[2][1], arr11[2][2] ,arr11[2]3] ]  
		 * ]
		 */
		
		
		int[][] arr = new int[9][9];
		for (int i = 0; i < arr.length; i++) {
//			System.out.print((i+1)+"단 : [");
			System.out.print((i+1)+"단 : ");
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = (i+1)*(j+1);
//				if((j+1) == arr.length) {
//					System.out.print(arr[i][j]);
//				}else {
//					System.out.print(arr[i][j] + ", ");
//				}
			}
//			System.out.println("]");
			System.out.println(Arrays.toString(arr[i]));
		}
		
		
	}

}
