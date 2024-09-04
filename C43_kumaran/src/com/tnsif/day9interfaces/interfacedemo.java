package com.tnsif.day9interfaces;



          interface one{    
        	  
	//only abstract method 
	// will have default public abstract 
        	  int age =20; // final a static 
        	  void show();// default public abstract 
        	  
        	  
          }
          
          class two implements one{
        	  @Override
        	  public void show() {
        		  System.out.println(" Interface methode one");
        	  }
          }
          
	
	
	
	
	
	
          public class interfacedemo {
	
	public static void main (String[]args) {
		two s =new two();
		s.show();
		
	}
}
