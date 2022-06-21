package step01;

public class Ex04ThreadState {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
			
				Thread thread2 = new Thread(new Runnable() {
					
					@Override
					public void run() {
						for(int i=0; i<100000000; i++) {}
							try {
								Thread.sleep(1000);
//								Thread.sleep(3000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						
					}
				});
				while (true) {
					System.out.println(thread2.getState());
					if(thread2.getState() == Thread.State.NEW) {
						thread2.start();
						System.out.println(thread2.getState());
					}else if(thread2.getState() == Thread.State.TERMINATED){
						break;
					}
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		thread1.start();
	}

}
