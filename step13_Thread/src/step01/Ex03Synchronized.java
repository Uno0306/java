package step01;

/*
 * 1. 하나의 맴버 변수를 갖는 클래스 -> setXXX을 통해 해당 멤버 변수를 변경
 * 단, 특정 값을 이미 갖고 있는 경우, 다른 스레드가 setXXX 수행하지 못하도록!
 * 2. 각각 다른 스레드에서 setXXX 실행 -> 결과? 
 */
class NumberChange{
	int number;
	
//	public void setNumber(int number) {
	public synchronized void setNumber(int number) {
		if(this.number != 7) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.number = number;
			System.out.println(number);
		}else {
			System.out.println("number 값을 변경할 수 없음");
		}
	}
}

public class Ex03Synchronized {
	public static void main(String[] args) {
		NumberChange nc = new NumberChange();
		
		// Thread 1
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				nc.setNumber(7);
			}
		});
		
		// Thread 2
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				nc.setNumber(10);
			}
		});
		
		//
		thread1.setPriority(10);
		thread2.setPriority(1);
		
		thread1.start();
		thread2.start();
		
		// 공통적으로 접근하는 맴버 변수의 경우에는 스레드 보장이 되지 않음!
		// 그렇다면 어떻게 해결해야 할까?
		
	}

}
