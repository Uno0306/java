package step01;

class WorkObject {
	public synchronized void methodA() {
//	public void methodA() {
		// notify와 wait는 synchronized에서 사용 가능하다.
		System.out.println("WokerA의 메소드 작업 실행");
		notify();	// waiting 상태의 다른 스레드를 호출하는 기능
		try {
			wait();	// 자기 자신은 waiting 상태로 변경하는 기능
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
//		Thread.yield();
	}
	
	public synchronized void methodB() {
//	public void methodB() {
		System.out.println("WokerB의 메소드 작업 실행");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
//		Thread.yield();
	}
}

class WokerA extends Thread{
	private WorkObject workObject;
	
	public WokerA(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			workObject.methodA();
//			Thread.yield();
		}
	}
}

class WokerB extends Thread{
	private WorkObject workObject;
	
	public WokerB(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			workObject.methodB();
//			Thread.yield();
		}
	}
}


public class Ex06ThreadCooperation {
	public static void main(String[] args) {
		WorkObject sharedObj = new WorkObject();
		
		WokerA workerA = new WokerA(sharedObj);
		WokerB workerB = new WokerB(sharedObj);
		
		//
		workerA.start();
		workerB.start();
	}
}



