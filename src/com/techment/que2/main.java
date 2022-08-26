package com.techment.que2;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String args[]) {
		Scanner in =new Scanner(System.in);
		
	System.out.println("Length of array:");
		int size=in.nextInt();
		
		System.out.println("Sum of:");
		int sum=in.nextInt();
		ArrayList<num> arr_tmp=new ArrayList<>();
		int tmp;
		int[] arr=new int[size];
		
		System.out.println();
		
		for(int i=0;i<size;i++) {
			
			arr[i]=in.nextInt();
		
		}
		
		for(int i=0;i<size;i++) {
			tmp=sum-arr[i];
			for(int j=i+1;j<size;j++) {
				
				if(tmp==arr[j]) {
					arr_tmp.add(new num(arr[i], arr[j]));
				}
			}
		}
		for(num n:arr_tmp) {
			
			System.out.print(n);
		}
		
	}
}

