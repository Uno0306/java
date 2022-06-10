package step01.exception;

class A{}
class B extends A{}
class C extends A{}

public class Ex01Exception {
	public static void main(String[] args) {
		// java.lang.NullPointerException
		String str1 = null;
//		System.out.println(str1.length());
		
		// java.lang.NumberFormatException
		String str2 = "three";
//		Integer.parseInt(str2);
		
		// java.lang.ArrayIndexOutOfBoundsException
		int[] i1 = {1, 2, 3};
//		System.out.println(i1[3]); // 에러
		
		// java.lang.ClassCastException
		A a = new B();
		B b = new B();
//		C c = (C)a; // 에러
		
		System.out.println(a instanceof B);
		System.out.println(a instanceof C);
		
		System.out.println(b instanceof B);
//		System.out.println(b instanceof C); // 에러
		
		// java.lang.ArithmeticException
		int i2 = 10/0;
//		System.out.println(i2); // 에러
	}
}