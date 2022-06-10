package step05.interfaceex;

public class HomeCalculator implements Calc{

//	public void turnOn() {
//		System.out.println("turn On");
//	}

	@Override
	public int add(int x, int y) {
		return x + y;
	}
	
	@Override
	public int substract(int x, int y) {
		return x - y;
	}
	
	@Override
	public int times(int x, int y) {
		return x * y;
	}
	
	@Override
	public int divide(int x, int y) {
		if (y != 0) {
			return x /  y;
		} else {
			System.out.println("에러");
			return ERROR;
		}
	}


}
