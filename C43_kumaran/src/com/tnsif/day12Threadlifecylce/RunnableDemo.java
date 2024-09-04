package com.tnsif.day12Threadlifecylce;

public class RunnableDemo {
	public static void main(String[] args) {
		//Using implementable class : it is used to declare a class that implements an interface
		UsingRunnable obj = new UsingRunnable(10,20, "Hello");
		
		Runnable runnable = new Runnable() {
			@Override
			public void run() { //anonymous class
				System.out.println("Runnable with Anonymous Class");
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
		
		//lambda expression
		runnable = () -> {
			System.out.println("Runnable with Lambda Expression");
		};
		new Thread(runnable).start();
		
		
		System.out.println("------------------------------------------------------");
		int n=5;
		runnable = () -> {
			try {
				for(int i = 1; i <=n; i++) {
					System.out.println("Loop Iteration: " + i);
					Thread.sleep(1000);
				}

			} catch (InterruptedException e) {
				System.err.println("Task interrupted");
			}
		};
		
		//Execute the runnable
		new Thread(runnable).start();

	}

}
