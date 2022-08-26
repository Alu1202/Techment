package com.techment.que3;

public class customer {
String ac_number;
double balance;
String name;
int pin;
public customer(String ac_number,String name,int pin) {
	super();
	this.ac_number = ac_number;
	this.name=name;
	this.pin=pin;
}
@Override
public String toString() {
	return "Customer [A/c No.=" + ac_number + ", Name=" + name + " Avl. Balance=" + balance + "]";
}
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}
public customer() {
	//TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAc_number() {
	return ac_number;
}
public void setAc_number(String ac_number) {
	this.ac_number = ac_number;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}

}
