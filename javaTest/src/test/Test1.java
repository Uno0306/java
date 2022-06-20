package test;

class Person{
	protected String personName = "person";
	
	public void method1() {
		System.out.println(personName);
	}
}
class Student extends Person{
	private String studentName = "student";
	public void method1() {
		System.out.println(studentName);
	}
	public void method2() {
		super.method1();
	}
	
}

public class Test1 {
	public static void main(String[] args) {
		
		// Test1-1 객체 생성 방법이 잘못된 부분과 그 이유는?
//		Student student1 = new Student();
//		Person student2 = new Student();
//		Person person1 = new Person();
//		Student person2 = new Person();
	
		// Test1-1 : Student객체 에 Person을 넣을 수가 없다. 
		//			 형이 맞지 않아서 변환을 해줘야 한다. -> Student는 Person뿐 아니라 다른 정보를 가지고 있어서 다르다.
		
		// Test1-2 student3에서 자식의 메소드 호출하고 student4에서 부모의 메소드를 호출하려면?
		Person student3 = new Student();
		Student student4 = new Student();
		
		// Test1-2 : student3는 student3.method로 그대로 출력
		//			 student4는 super 사용하여 출력
		student3.method1();
		student4.method2();
	}
}
