package test;

import java.util.ArrayList;

abstract class Car {
	abstract void run();
}

class Ambulance extends Car { 
	void run() { System.out.println( "앰뷸런스  run!" ); } 
}

class Cultivator extends Car {
	void run() { System.out.println( "경운기 run!" ); }
}

class SportsCar extends Car {
	void run() { System.out.println( "스포츠카 run!" ); }
}


public class Test4 {
	public static void main(String[] args) {
		
		
		// Test4 ArrayList를 통해 전체 값 출력하기
		/*
		 * 앰뷸런스  run!
		 * 경운기 run!
		 * 스포츠카 run!
		 */
		
		Ambulance ambulance = new Ambulance();
		Cultivator cultivator = new Cultivator();
		SportsCar sportsCar = new SportsCar();
		
		ArrayList<Car> carList = new ArrayList<Car>();
		carList.add(ambulance);
		carList.add(cultivator);
		carList.add(sportsCar);
		
		for (int i = 0; i < carList.size(); i++) {
			carList.get(i).run();
		}
		
	}
}
