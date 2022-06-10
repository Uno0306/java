package step03;

import model.domain.Car;

public class CarFactory {
	//싱글톤 패턴
	private static CarFactory factory = new CarFactory();
	//private 생성자
	private CarFactory() {
	
	}
	
	//createCar : return car;
	public static Car createCar() {
		Car car = new Car();
		return car;
	}

	public static CarFactory getInstance() {
		return factory;
	}

}
