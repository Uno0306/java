package step02.innerclass;

class OuterClass {
	private int number = 10;
	private static int staticNumber = 20;
	private InClass inClass;

	public OuterClass() {
		inClass = new InClass();
	}

	class InClass {
		int inNumber = 100;
//		static int staticInNumber = 200; // innerClass는 outerClass 객체가 생성될때 만들어져서 static 불가능

		void inPrint() {
			System.out.println("외부 클래스, 인스턴스 변수 = " + number); // 인스턴스 -> 객체가 생성됐을 때를 말함
			System.out.println("외부클래스, static 변수 = " + staticNumber);
			System.out.println("내부클래스, 인스턴스 변수 = " + inNumber);
		}

//		static void staticInPrint() {} // static한 부분에서 쓰이거나, 제일 윗부분(outer)에 쓰이거나 해야한다!

	}

	static class staticInClass {
		int inNumber = 100;
		static int staticInNumber = 200; // 따라서 여기서는 가능
	}
}

public class InnerClassTest {

	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		OuterClass.InClass inClass = outerClass.new InClass();

		OuterClass.staticInClass staticInClass = new OuterClass.staticInClass();
	}

}
