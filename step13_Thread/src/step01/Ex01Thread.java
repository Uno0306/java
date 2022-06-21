package step01;

// Thread 클래스를 통한 생성
public class Ex01Thread extends Thread{

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " " +  (i+1) + "번 실행");
		}
	}

	public static void main(String[] args) {
		Ex01Thread thread1 = new Ex01Thread();
		thread1.start();
		thread1.setName("스레드1");
		
		Ex01Thread thread2 = new Ex01Thread();
		thread2.start();
		thread2.setName("스레드2");

		System.out.println(Thread.currentThread().getName());
	}

}
