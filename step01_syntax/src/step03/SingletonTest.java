package step03;

public class SingletonTest {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		singleton1.say();
		singleton1.setName("호이");
		Singleton singleton2 = Singleton.getInstance();
		singleton2.setName("Si");
		singleton2.getName();
		System.out.println(singleton1); // 주소값 : 366712642
		System.out.println(singleton2); // 주소값 : 366712642
										// 주소값 동일
	}
}
