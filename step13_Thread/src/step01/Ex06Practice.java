package step01;

// 생산자 - 소비자

class Data{
	private String data;
	
	public synchronized void setData(String data) {
		if(this.data != null) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
		this.data = data;
		System.out.println("생산자가 생성한 데이터 : " + this.data);
		notify();
	}
	
	public synchronized void getData() {
		if (this.data == null) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("소비자가 소비한 데이터 : " + this.data);
		data = null;
		notify();
	}
}

class Producer extends Thread{
	private Data data;
	
	public Producer(Data data) {
		this.data = data;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			data.setData("Data=" + i);
		}
	}
}

class Consumer extends Thread{
	private Data data;
	
	public Consumer(Data data) {
		this.data = data;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			data.getData();
		}
	}
}

public class Ex06Practice {
	public static void main(String[] args) {
		Data data = new Data();
		
		Producer producer = new Producer(data);
		Consumer consumer = new Consumer(data);
		
		// start
		producer.start();
		consumer.start();
		
		/*
		 * 생산자가 생성한 데이터 : Data=1
			소비자가 소비한 데이터 : Data=1
			생산자가 생성한 데이터 : Data=2
			소비자가 소비한 데이터 : Data=2
			생산자가 생성한 데이터 : Data=3
			소비자가 소비한 데이터 : Data=3
			생산자가 생성한 데이터 : Data=4
			소비자가 소비한 데이터 : Data=4
			생산자가 생성한 데이터 : Data=5
			소비자가 소비한 데이터 : Data=5
		 */
	}
}

