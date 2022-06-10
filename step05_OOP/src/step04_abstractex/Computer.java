package step04_abstractex;

public abstract class Computer {
	
	abstract void dispaly();
	
	public void turnOn() {
		System.out.println("전원On");
	}
	
	public void turnOff() {
		System.out.println("전원Off");
	}
}