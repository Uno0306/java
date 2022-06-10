package step02_collection;

import java.util.ArrayList;

import model.domain.Student;

public class Ex01ArrayList {
	
	public static void main(String[] args) {
		// ArrayList
		ArrayList arr1 = new ArrayList();
		// add : 추가
		arr1.add("Java");
		arr1.add(new Student("Java", 1, "Junior"));
		arr1.add(3);
		arr1.add("Java");

		
		// get: 원소 객체 반환
		// System.out.println(arr1.get(0));
		
//		System.out.println(arr1);
		
		// size : 객체 수 반환
//		System.out.println(arr1.size());
		
		// ??
//		System.out.println(( (Student) arr1.get(1)).getName());
		
		// 제네릭(Generic) : 컬랙션 객체 생성 시, 저장되는 데이터 타입을 지정
		ArrayList<String> arr2 = new ArrayList<String>();
		// arr2.add(new Student("Java", 1, "Junior"));  - 타입 에러
		arr2.add("Java1");
		arr2.add("Java2");
		arr2.add("Java3");
		arr2.add("Java4");
		arr2.add("Java5");
		
		// remove : 해당 인덱스 객체 삭제
//		arr2.remove(2);
//		System.out.println(arr2.get(2));
		
		// for 출력??
//		for(int i=0; i<arr2.size(); i++) {
//			System.out.print(arr2.get(i) + " ");
//		}
		
//		for (String str : arr2) {
//			System.out.print(str + " ");
//		}
		
	}
}
