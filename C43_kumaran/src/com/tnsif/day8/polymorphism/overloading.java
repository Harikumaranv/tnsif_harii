package com.tnsif.day8.polymorphism;

import java.nio.channels.OverlappingFileLockException;

public class overloading {

		
		int num1;
		int num2;
		int result;
		
		void sum (int a,int b ) {
			num1=a;
			num2=b;
			result =num1+num2;
			
			System.out.println("the result of" +" " +result);
		}
		void sum (int a,double b ) {
			num1=a;
			num2=(int)b;
			result =num1+num2;
			
			System.out.println("the result of" +" " +result);
		}
		void sum (double a,double b ) {
			num1=(int)a;
			num2=(int)b;
			result =num1+num2;
			
			System.out.println("the result of"+" "+result);
		}
	
public static void main (String[]args) {
	
	overloading s = new overloading();
         s.sum(20, 40);
         s.sum(1,5.1);
         s.sum(2.1,1.0);
	
}
}


