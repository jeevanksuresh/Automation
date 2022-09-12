package com.attra.threads;

public class ThreadSleep {

	public static void main(String[] args) {
		long starTime = System.currentTimeMillis();
		System.out.println("Starting the program...");
		
		try {
			Thread.sleep(2000);
		 
		
		long endTime = System.currentTimeMillis();
		System.out.println("Thread name is : "+ Thread.currentThread().getName());
		System.out.println("Thread priority is : "+ Thread.currentThread().getPriority());
		Thread.currentThread().setName("User Thread");
		Thread.currentThread().setPriority(5);
		
		System.out.println("Thread name is now updated as : "+Thread.currentThread().getName());
		System.out.println("Thread priority is now changed: "+Thread.currentThread().getPriority());
		
		System.out.println("Completed the Program execution with time of "+(endTime-starTime));
		
	}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}}
