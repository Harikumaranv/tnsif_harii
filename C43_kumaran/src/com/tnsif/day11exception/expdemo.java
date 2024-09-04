package com.tnsif.day11exception;

import java.util.*;

public class expdemo {
	
	public static void main(String[]args) {

	Scanner s = new Scanner(System.in);
	
	
	try {
		
		System.out.println("enter the number ");
		
		int n =s.nextInt();
		
		System.out.println(n % 2== 0  ? n+"is even number" : n+"is Odd number");
	
		return;	
	}
	catch(InputMismatchException e) 
	
	{
		
		System.err.println("invalid input...");
	}
	
	finally
	{
		
		System.out.println("in finally ");
		
	}
	
	
	}
	
}
