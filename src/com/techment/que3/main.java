package com.techment.que3;

import java.util.ArrayList;

public class main {

	ArrayList<customer>list=new ArrayList<>();
	
	public static void main(String args[]) {
			
			customer customer_objCustomer=new customer("9294504193", "Alekh Agarwal",0000);
			main objMain=new main();
			objMain.createAccount(customer_objCustomer);
			
			objMain.deposit("9294504193", 0000,1000);
			

	}
	
	
	public void deposit(String ac_number,int pin,double amt ) {
		for(customer cus:list) {
			if(cus.getAc_number().equals(ac_number)) {
				if(cus.getPin()==pin) {
					
			
					double balance =cus.getBalance()+amt;
					cus.setBalance(balance);
					System.out.println(cus.toString());
					System.out.println("Successfull");
					
				}else {
					System.out.println("Incorrect Pin");
				}
			}else {
				System.out.println("No account found with A/c No."+ac_number);
			}
		}
		
		
	}

	public void withdraw(String ac_number,int pin,double amt) {
		for(customer cus:list) {
			if(cus.getAc_number().equals(ac_number)) {
				if(cus.getPin()==pin) {
					
				if(	cus.getBalance()>amt) {
					double balance =cus.getBalance()-amt;
					cus.setBalance(balance);
					System.out.println(cus.toString());
				}else {
					System.out.println("Insufficient Balance!");
					System.out.println(cus.toString());
				}
				}else {
					System.out.println("Incorrect Pin");
				}
			}else {
				System.out.println("No account found with A/c No."+ac_number);
			}
		}
	}
	
	public void createAccount(customer customer_obj) {
		customer c= new customer();
				
		c.ac_number=customer_obj.getAc_number();
		c.balance=0;
		c.name=customer_obj.getName();
		c.pin=customer_obj.getPin();
		list.add(c);
	}
}
