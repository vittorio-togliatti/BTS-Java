package com.vittorio.students;

public class MainCars {

	public static void main(String[] args) {
		Driver luca = new Driver();
		Car lucasCar = new Car();
		
		luca.age = 25;

		lucasCar.color = "red";
		lucasCar.speed = 200;
		
		lucasCar.printColor();
		
		
		if (luca.age>20) {
			lucasCar.printSpeed();
		} else {
			lucasCar.printLimitedSpeed();
		}
		
	}

}
