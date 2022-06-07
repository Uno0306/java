package step01_syntax;

public class Ex02Variable {

	public static void main(String[] args) {
		// 타입 변수명 = 값;
		// 기본타입 (primitive) 타입
		// 정수
		
		byte vb1 = -128;
//		byte vb2 = 128;
		short vs1 = 128;
//		System.out.println(vb1);
//		System.out.println(vs1);
		
		int vi1 = 10;			// 10진수
		int vi2 = 0B1010;		// 2진수 0B+2진수
		int vi3 = 012;			// 8진수 0+8진수
		int vi4 = 0XA;			// 16진수 : 0X+16진수
//		System.out.println(vi1);
//		System.out.println(vi2);
//		System.out.println(vi3);
//		System.out.println(vi4);

		long vl1 = 10;
		long vl2 = 10000000000L;
		System.out.println(vl1);
		
		
		// 실수 : float(32), double(64)
		float vf1 = 3.14F;
		double vd1 = 3.14;
		System.out.println(vf1);
		
		
		// 
		Character vc1 = 'A';
		System.out.println(vc1);
		
		boolean isTrue = true;
		boolean isFalse = false;
		
	}

}
