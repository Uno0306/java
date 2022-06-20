package test;

class Person2 {
	String name;
	int age;
	int weight;
	
	Person2() {}
	Person2( String name, int age, int weight ) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	void wash() { System.out.println( "wash" ); }
	void study() { System.out.println( "study" ); }
	void play() { System.out.println( "play" ); }
	public void test() {System.out.println("Person5 - test");}
}

interface Allowance {
	
	abstract void in( int price, String name );
	abstract void out( int price, String name );
	default void test() {
		System.out.println("interface - test");
	}
}

interface Train {
	abstract void payTuitionFee( int tuitionFee, String name );
}

class Student2 extends Person2 implements Allowance, Train {
	Student2() {}
	Student2( String name, int age, int weight ) {
		super( name, age, weight );
	}
	
	public void in( int price, String name ) { System.out.printf( "%s 에게서 %d원 용돈을 받았습니다.%n", name, price ); }
	public void out( int price, String name ) { System.out.printf( "%d원 금액을 지출했습니다. [지출용도 --> %s]%n", price, name ); }
	public void payTuitionFee( int tuitionFee, String name ) { System.out.printf( "[%s --> %d원 입금완료]%n", name, tuitionFee ); }
	public void test() {super.test();}
}

public class Test5 {
	public static void main(String[] args) {
		
		
		// Test5 결과 출력하기 & extends와 implements중에서 우선적으로 적용되는 것은 무엇인지 확인해보기
		/* 
		 * wash
		 * study
		 * play
		 * 엄마 에게서 10000원 용돈을 받았습니다.
		 * 5000원 금액을 지출했습니다. [지출용도 --> 편의점]
		 * [훈련비 --> 50000원 입금완료]
		 */
		Student2 student = new Student2();
		student.wash();
		student.study();
		student.play();
		student.in(10000, "엄마");
		student.out(5000, "편의점");
		student.payTuitionFee(50000, "훈련비");
		
		// Test5 : 상속이 우선적 적용된다. 
		// 속도 자체는 implement가 빠르지만 자바 규칙에 의해서 상속이 먼저 적용
		System.out.println("\n우선 적용 확인 코드");
		student.test();
		
	}
}
