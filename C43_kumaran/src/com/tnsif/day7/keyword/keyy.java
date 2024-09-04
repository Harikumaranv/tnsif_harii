package com.tnsif.day7.keyword;



abstract class value{
	void show() {
		System.out.println("Abstract");
		
	}
}
// create another class and extend it 


public class keyy extends value {
	// abstract int a; -it's not possible to create  a

	public static void main(String[] args) {
		keyy s= new keyy();
          s.show();
	}

}
