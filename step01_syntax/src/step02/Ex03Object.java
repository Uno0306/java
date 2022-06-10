package step02;

public class Ex03Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 생성 시점
		// - B 객체의 생성 완료 시점 언제?
		//		: 객체의 생성은 객체가 보유하고 있는
		//		모둔 맴버변수(필드)들이 메모리에 생성이 되어야
		//		객체의 생성이 완료가 된다.
		A a = new A();
		B b = new B();
		C c = new C();
	}

}

class A{
	A(){
		System.out.println("Class A");
	}
}

class B{
	//멤버변수처럼
	//멤버변수를 사용하기 위해서는 객체를 생성해야함 
	A a = new A();
	String name ="java";
	int age = 27;
	
	B(){
		System.out.println("Class B");
	}
}
class C{
	C(){
		System.out.println("Class C");
	}
}
