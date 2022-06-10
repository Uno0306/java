package step01.exception;

class info{
	static {
		System.out.println("Info 클래스");
	}
}

public class Ex02Exception {

	public static void main(String[] args) {

		try {
			Class.forName("step01.exception.info");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// System.out.println(4);
		}
		
		
		// catch문 순서
		try {
			// java.lang.NullPointerException
			String str1 = null;
			System.out.println(str1.length());
			
			// java.lang.NumberFormatException
			String str2 = "three";
			 Integer.parseInt(str2);
		} catch (Exception e) {
			System.out.println("Exception");
		}
		
	}

}
