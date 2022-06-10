package step03;

import model.domain.Car;

public class CarFactoryTest {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// CarFactoryTest
		CarFactory factory = CarFactory.getInstance();
		Car myBenz = factory.createCar();
		Car yourBenz = factory.createCar();

		System.out.println(myBenz.getCarNum()); // 344
		System.out.println(yourBenz.getCarNum()); // 345
	}

}
