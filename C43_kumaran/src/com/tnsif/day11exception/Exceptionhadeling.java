package com.tnsif.day11exception;

public class Exceptionhadeling {
	public void demo() {
		int a=5;
		System.out.println(a);
	}
	public void show() {
		try {
			demo();
			throw new Exception();
		}
		catch(Exception e) {
			System.out.println("Exception-----> "+e);
		}
		finally {
			System.out.println("hello world");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exceptionhadeling s =new Exceptionhadeling();
		s.demo();
		s.show();

	}

}
