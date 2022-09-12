package com.attra.threads;

public class ThreadByRunnableInterface implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Printing from thread :"+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		
		System.out.println("Starting the program...");
		ThreadByRunnableInterface runnable = new ThreadByRunnableInterface();
		Thread thread = new Thread(runnable, "Runnable");
		thread.start();
		System.out.println("Executed by thread :"+Thread.currentThread().getName());
		System.out.println("Program end...");
	}
		
	}


