package step01.api;

class Busan{
	public int num;
	
	public Busan(int num) {
		this.num = num;
		System.out.println("Busan"+ num +"가 생성");
	}
	
	public void finalize() {
		System.out.println("Busan"+ num +"가 제거");
	}
}

public class Ex01LangPackage {

	public static void main(String[] args) {
		//Object 클래스
		Object obj1 = new Object();
		Object obj2 = new Object();
		
//		System.out.println(obj1.toString());
//		System.out.println(obj2.toString());
		
		//equals : 동일 객체 비교 결과 반환
//		System.out.println(obj1.equals(obj2));
		
		// hashCode : 객체의 주소값을 정수로 변환 및 반환
		
		// toString : 문자열로 된 객체의 정보를 반환
		
		// System 클래스
		// getProperty : 시스템 속성값을 반환
//		System.out.println(System.getProperty("os.name"));
		
		// !중요  gc : garbage collector 쓰레기 수집기
//		Busan busan;
//		
//		busan = new Busan(1);
//		busan = null;
//		busan = new Busan(2);
//		busan = new Busan(3);
//		
//		System.gc();
		
		// String 클래스
		// equals : 문자열의 내용을 비교
		
		// charAt : 지정 인덱스의 위치 문자를 반환
		String str1 = "Java API";
//		System.out.println(str1.charAt(8)); //에러
		
		// length : 문자열의 길이 반환
//		System.out.println(str1.length());
		
		// 대소문자 변환 메소드
//		System.out.println(str1.toLowerCase());
//		System.out.println(str1.toUpperCase());
		
		// substring : 지정 위치에서 또 다른 위치의 잘라낸 문자열 반환
//		System.out.println(str1.substring(0));
//		System.out.println(str1.substring(1, 6));
		
		// replace : 변경 대상 문자열 -> 지정 문자열로 변경된 결과를 반환해줌
//		System.out.println(str1.replace("Java", "자바"));
//		System.out.println(str1.replace("java", "자바"));
		
		// trim : 문자열의 앞, 뒤에 있는 빈 공백을 제거한 결과 반환
//		String str2 = "   Java API   ";
//		System.out.println(str2);
//		System.out.println(str2.trim());
		
		// split : 특정 구분자를 기준으로 분리된 문자열 결과 반환
		String str3 = "Java API String Test";
//		System.out.println(str3.split(" "));
//		
//		for(String str : str3.split(" ")) {
//			System.out.println(str);
//		}
		
		// StringBuilder 클래스 : 잦은 변경이 있을 때 사용하기 좋음, 새로운 객체 생성 X
//		String str4 = "abc";
//		System.out.println(str4.hashCode());
//		
//		str4 += "def";
//		System.out.println(str4.hashCode());
//		
//		StringBuilder sb = new StringBuilder("abc");
//		System.out.println(sb.hashCode());
//		
//		sb.append("def");
//		System.out.println(sb.hashCode());
		
		//Wrapper 클래스 : 기본타입의 값을 갖는 객체 생성
		//명시적 박싱(Boxing) : 기본타입을 객체타입으로 변환
		Integer intgr1 = new Integer(1);
//		System.out.println(intgr1.getClass());
		
		//명시적 언박싱(Unboxing) : 객체타입을 기본타입으로 변환
//		System.out.println(intgr1.intValue());
		
		//자동 박싱
		Integer intgr2 = 2;
//		System.out.println(intgr2.getClass());
		
		// 자동 언박싱
		int intgr3 = intgr2;
//		System.out.println(intgr3);
		
		//parse : 문자열을 기본타입으로 변환
//		System.out.println(Integer.parseInt("3"));
//		System.out.println(Double.parseDouble("3"));
//		System.out.println(Integer.parseInt("three")); // java.lang.NumberFormatException
		
		String strInt1 = "1";
		int int1 = 1;
//		System.out.println(strInt1);
//		System.out.println(int1);
//		System.out.println(int1.getclass()); int는 기본타입이기에 getclass()사용 불가능
		
		// Math 클래스 : 수학적 계산을 위한 클래스
		// abs : 절대값
		System.out.println(Math.abs(-125));
		
		// ceil : 올림 값, floor : 내림 값, round : 반올림 값
		System.out.println(Math.ceil(3.4));
		System.out.println(Math.ceil(3.6));
		System.out.println(Math.floor(3.4));
		System.out.println(Math.floor(3.6));
		System.out.println(Math.round(3.4));
		System.out.println(Math.round(3.6));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}