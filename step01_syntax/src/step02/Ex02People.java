package step02;

public class Ex02People {
	// 멤버 변수(필드)
	String name = "Java";
	int age = 27;

	// 기본 생성자 : 객체 생성 시, 필수 요소(생략시, 자동 완성)
	Ex02People() {
	}

	// 사용자 정의 생성 : 객체 생성 시, 초기화  - 생성자 오버로딩(Overloading)
	// 변환값, 형태 같으나 매개변수의 갯수가 다른 생성자를 만들 경우
	public Ex02People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Ex02People(String name) {
		this.name = name;
	}
	

	// 메소드
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// 단순 출력("단순 출력 메소드") 메소드
	void print() {
		System.out.println("단순 출력 메소드");
	}

	public static void main(String[] args) {
		Ex02People ppl1 = new Ex02People();
		System.out.println(ppl1.getName());

		// ppl1의 이름을 New Java 로 변경하고자 한다면?
		ppl1.name = "New Java";
		System.out.println(ppl1.getName());

		// ppl2
		Ex02People ppl2 = new Ex02People();
//		System.out.println(ppl1.hashCode());
//		System.out.println(ppl2.hashCode());
		System.out.println(ppl2.name);
		ppl2.name = "New Java2";

		// ppl3
		Ex02People ppl3 = new Ex02People("Java3", 45);
		System.out.println(ppl3.name);

		// ppl4
		Ex02People ppl4 = new Ex02People("Java4");
		System.out.println(ppl4.name);
		System.out.println(ppl4.age);
	}

}
