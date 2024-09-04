package com.tnsif.day9interfaces;

public class Wrapperclass {
	public static void main (String[]args) {
		// unboxinng  converting explicitly
		Integer i= new Integer(10);
		
	
		System.out.println(i);
		int b =i.intValue();
		System.out.println(b);
		
		
		// without using intvalue();
		int c=i;
		System.out.println(c);
		
		
		// Autoboxing - converting implicitly
		int a=100;
		Integer i1 =a;
		System.out.println(i1);
	}
	

}
