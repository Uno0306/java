package step01;

public class Ex07ThreadSafetyStop extends Thread {

	public Ex07ThreadSafetyStop(ThreadGroup threaadGroup, String threadName) {
		super(threaadGroup, threadName);
	}

	public Ex07ThreadSafetyStop() {}

	@Override
	public void run() {
		while(true) {
			System.out.println("스레드 실행중");
			
			if(Thread.interrupted()) {	// 이 메소드를 호출했으면?
				System.out.println("--스레드 종료--");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Ex07ThreadSafetyStop thread = new Ex07ThreadSafetyStop();
		thread.start();
		
		try {
			Thread.sleep(1000);
			thread.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		// 스레드 그룹화
		ThreadGroup busan = new ThreadGroup("busan");
		Ex07ThreadSafetyStop thread1 = new Ex07ThreadSafetyStop(busan, "thread1");
		Ex07ThreadSafetyStop thread2 = new Ex07ThreadSafetyStop(busan, "thread2");
		Ex07ThreadSafetyStop thread3 = new Ex07ThreadSafetyStop(busan, "thread3");
		
	}

}
