package step07.practice;

class Person extends Object{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	/* equals 재정의
	 * 1. 매개변수로 들어온 Object타입의 객체 -> Person 타입으로 형 변환이 가능한지 검증
	 * 2. instanof
	 * 3. name, age 값을 비교
	 * 4. 검증 후, name, age가 갖고 있는 데이터가 동일한 경우 -> true 반환
	 */
	
	@Override
	public boolean equals(Object object) {
		// ver1
//		if(object instanceof Person 
//				&& this.name.equals(((Person) object).name) 
//				&& this.age == ((Person) object).age) {
//			return true;
//		}else {
//			return false;
//		}
	
		// ver2
//		if(object instanceof Person) {
//			if(name.equals(((Person) object).name) 
//					&& age == ((Person) object).age) {
//				return true;
//			}
//		}
//		return false;

		//ver3
		if(object instanceof Person) {
			Person person = (Person) object;
			if(name.equals(person.name) && age == person.age) {
				return true;
			}
		}
		return false;
		
		
		
		
		
	}
	
}

class Person2 {
	String name;
	int age;
	
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
}



public class EqualsOverride {
	public static void main(String[] args) {
		Person p1 = new Person("JAVA", 27);
		Person p2 = new Person("JAVA", 27);
		Person2 p3 = new Person2("JAVA", 27);
		
		
		// 주소값
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		
		System.out.println();
		
		// equals
		System.out.println(p1.equals(p2));
//		System.out.println(p1.name.equals(p2.name));
//		System.out.println(p1.age == p2.age);
		System.out.println(p1.equals(p3));
	}
}
