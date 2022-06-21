package step01;

class ThreadA extends Thread{
	private boolean stop = false;
	private boolean flag = true;
	
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		while(!stop) {
//			System.out.println(Thread.currentThread().getState());
			if(flag) {
				System.out.println("ThreadA 작업중");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				Thread.yield();
			}
		}
	}
}

class ThreadB extends Thread{
	private boolean stop = false;
	private boolean flag = true;
	
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		while(!stop) {
			if(flag) {
				System.out.println("ThreadB 작업중");				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				Thread.yield();
			}
		}
	}
}

class SumThread extends Thread{
	private int sum;
	
	public int getSum() {
		return sum;
	}

	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			sum += i;
		}
	}
}


public class Ex05ThreadControl {

	public static void main(String[] args) {

		
		//
//		ThreadA threadA = new ThreadA();
//		ThreadB threadB = new ThreadB();
		
//		threadA.start();
//		threadB.start();
		
		// Thread B만 실행
//		threadA.setFlag(false);
		
//		threadA.setStop(true);
//		threadB.setStop(true);
		
		
		// join
		SumThread sumThread = new SumThread();
		sumThread.start();
		try {
			// 메인 스레드는 일시 정지 -> sumThread의 실행이 끝나면 다시 실행
			sumThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Total Sum = " + sumThread.getSum());
	}

}
