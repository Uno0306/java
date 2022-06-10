/*
 * 싱글톤 패턴(Singleton Pattern)
 * - 하나의 객체만 생성 가능 -> 내부의 메소드 혹은 데이터를 사용하는 경우
 */
package step03;

public class Singleton {

	// 멤버변수 필드
	String Name = "Singleton";
	private static Singleton instance = new Singleton();
	
	//private 생성자
	private Singleton() {

	}

	//메소드(getInstance) : 내부에서 생성된 객체를 공유하도록 설정
	public static Singleton getInstance() {
		return instance;
	}

	public void say() {
		System.out.println("Hi,there");
	}

	public void setName() {
//		this.Name = Name;
		System.out.println(this.Name);
	}

	public void setName(String Name) {
		this.Name = Name;
		System.out.println(this.Name);
	}

	public void getName() {
		System.out.println(Name);
	}
}
