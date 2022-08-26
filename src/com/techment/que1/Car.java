package com.techment.que1;

public class Car {
private int yearModel;
private String make;
private int speed;
public Car(int yearModel, String make) {
	super();
	this.yearModel = yearModel;
	this.make = make;
	this.speed=0;
}
public int getYearModel() {
	return yearModel;
}
public void setYearModel(int yearModel) {
	this.yearModel = yearModel;
}
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}

public void accelerate() {
	
	this.speed+=5;
	
}
public void brake() {
	if(this.speed!=0) {
		this.speed-=5;
}
	}
}
