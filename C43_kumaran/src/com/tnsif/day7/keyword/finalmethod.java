package com.tnsif.day7.keyword;
final class  demo {
	
	final String name= "hari";// final variable 
	final void show() { // final  method 
		System.out.println("final statement");
		// name ="x y z"; once you create  you can't change
	}
}

class value1 extends value{  // final class cannot be extended or inherited
	void disp() {
		System.out.println("hello");
	}
	
}

public class finalmethod {
	
public static void main(String[]args) {
	demo s= new demo();
	s.show();
	
}

}
