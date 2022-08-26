package com.techment.que4;

import java.util.Scanner;

public class main {
public static void main(String args[]) {
	Scanner in =new Scanner(System.in);
	System.out.println("Enter A String");
	String str= in.nextLine(); int countSpace=0;
	for(int i =0;i<str.length();i++) {
		if(str.charAt(i)==' ') {
			countSpace++;
			
		}
	}System.out.println("Words->"+(countSpace+1));
	System.out.println("letters->"+(str.length()-countSpace));
}
}
