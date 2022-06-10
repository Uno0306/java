package step03.oop;

class A {}
class B extends A {}
class C extends A {}

public class Instanceof {
	public static void main(String[] args) {
		A a1 = new B();
		A a2 = new C();
		A a3 = new A();

		System.out.println(a1 instanceof A); //true
		System.out.println(a1 instanceof B); //true
		System.out.println(a1 instanceof C); //false

		System.out.println();

		System.out.println(a2 instanceof A); //true
		System.out.println(a2 instanceof B); //false
		System.out.println(a2 instanceof C); //true
	}

}