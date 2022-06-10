package step04_template;

public abstract class Car {
	
	abstract void drive();
	abstract void stop();
	
	public void turnOn() {
		System.out.println("turn on");
	}
	
	public void turnOff() {
		System.out.println("turn off");
	}
	
	final public void run() {
		turnOn();
		drive();
		stop();
		turnOff();
	}
}