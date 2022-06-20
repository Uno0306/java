package test;


abstract class Animal {
	private String animalSound = "";
	public void cry(){
		System.out.println(animalSound);
	}
}

class Dog extends Animal{
	private String animalSound = "멍멍!";
	public void cry(){
		System.out.println(animalSound);
	}
}

class Cat extends Animal{
	private String animalSound = "야옹!";
	public void cry(){
		System.out.println(animalSound);
	}
}

class Cow extends Animal{
	private String animalSound = "음메!";
	public void cry(){
		System.out.println(animalSound);
	}
}

class Animal2 extends Animal{
	private String animalSound = "윙윙!";
	public void fly(){
		System.out.println(animalSound);
	}
}

public class Test2 {
	public static void main(String[] args) {
		
		// Test2 결과 출력하기
		/*
		 * 윙윙!
		 * 멍멍!
		 * 야옹!
		 * 음메!
		 */
		
		Animal2 dragonfly = new Animal2();
		dragonfly.fly(); // 윙윙!
		
		Dog dog = new Dog();
		dog.cry();  // 멍멍!
		
		Cat cat = new Cat();
		cat.cry();  // 야옹!
		
		Cow cow = new Cow();
		cow.cry();  // 음메!
		
	}
}
