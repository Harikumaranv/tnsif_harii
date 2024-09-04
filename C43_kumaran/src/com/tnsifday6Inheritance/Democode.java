package com.tnsifday6Inheritance;

public class Democode {
  
	public  static class  a{
		
	public void Show() {
	  System.out.println("Im a parent");
  } //
}
  
	
 public static class a1 extends a{
	 
  public void demo () {
	  System.out.println("Im a child");
	  
       }
	}
	
	
	public static void main(String[] args) {
		
		a1 h =new a1();
		h.demo();
		h.Show();
	}
}
	
