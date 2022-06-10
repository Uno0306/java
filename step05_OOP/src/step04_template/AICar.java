package step04_template;

public class AICar extends Car{

	@Override
	void drive() {
		System.out.println("자울 주행 시작");
	}

	@Override
	void stop() {
		System.out.println("자울 주행 종료");
	}

}