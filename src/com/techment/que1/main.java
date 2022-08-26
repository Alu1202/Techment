package com.techment.que1;

public class main {

	public static void main(String arg []) {
		Car car_obj=new Car(1965, "Bat Mobile");
		for(int i=0;i<5;i++) {
			car_obj.accelerate();
			System.out.println( car_obj.getSpeed());
		}
		for(int j=0;j<5;j++) {
			car_obj.brake();
			System.out.println( car_obj.getSpeed());
		}
	}
}
