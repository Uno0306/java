package step02.innerclass;

class OutClass {
	int outNumber = 100;
	static int staticOutNumber = 200;

	// 지역 클래스
	Runnable getRunnable(int i) {
		int number = 100;

//		class MyRunnable implements Runnable {
		return new Runnable() {
			int localNumber = 10;

			@Override
			public void run() {
				// 외부 클래스 모두 사용 가능!
				System.out.println("외부 클래스, 인스턴스 변수 = " + outNumber);
				System.out.println("외부 클래스, static 변수 = " + staticOutNumber);

				System.out.println();
				//
//				i = 100;		// final : 값 변경 되지 않음.(상수 풀 메모리에 계속 존재하는 것과 같음) 그래서 상수로 사용 가능!
//				number = 1000; // 둘다 final로 되어 있다!

				// 따라서 getRunnable이라고 하는 메소드가 호출되어 끝났다 할지라도
				// run 메소드 내부에서 계속해서 호출하여 사용 할 수 있음

				// 메소드랑 지역클래스 자체의 변수 사용 가능? ㅇㅇ 가능!
				System.out.println("외부 클래스, 매개변수 = " + i); // 외부 클래스의 메소드의 매개변수
				System.out.println("메소드, 지역변수 = " + number);
				System.out.println("지역 클래스, 인스턴스 변수 = " + localNumber);
			}
		};
//		return new MyRunnable(); // 지역 클래스인데 외부에서 사용되지 않는다!
		// 지역 클래스 -> 익명 클래스 11 line -> 12 line, 34 line } => }; , 35line -> 삭제
	}

	// 익명 클래스
	Runnable runner = new Runnable() {

		@Override
		public void run() {
			System.out.println("Runnable이 구현된 익명 클래스 변수");
		}
	};
}

public class LocalAnonymousInnerTest {

	public static void main(String[] args) {
		OutClass out = new OutClass();
		Runnable runner = out.getRunnable(10);
		runner.run();

		System.out.println();
		//
		out.runner.run();
	}

}
