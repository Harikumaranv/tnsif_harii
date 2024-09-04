package com.tnsif.day9interfaces;

interface parent1{
	public void show();
}

interface parent2{
	public void  disp();
	
	
}

class myclass{
	public void display() {
		System.out.println("method in class  ");
	}
}

class child extends myclass implements parent1,parent2 {
	
	@Override
	public void disp() {
		System.out.println("hello ! ! !");
	}

	@Override
	public void show() {
		System.out.println("welcome ! ! ! ");
	}
}

public class multipleinterface {
	public static void main (String[]args) {
		
		child s =new child();
		s.display();
		s.disp();
		s.show();
		
		
	}

}
