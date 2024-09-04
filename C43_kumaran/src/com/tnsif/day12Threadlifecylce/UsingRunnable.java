package com.tnsif.day12Threadlifecylce;

public class UsingRunnable implements Runnable{

	// instance variable : inside the class but outside the method.
	Thread thread;
	int high, low;
	String msg;
	
	public UsingRunnable(int low , int high, String msg) {
		this.high = high; // this keyword is used to refer the current object
		this.low = low;
		this.msg = msg;
		thread = new Thread(this, "Child Thread");
		thread.start();
	}
	@Override
	public void run() {
		for(int i = low; i <= high; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Error " +e.getMessage());
			}
			System.out.println(msg + i );
			
		}
	}
}

