package com.attra.threads;

public class ThreadJoin {

	public static void main(String[] args) {

		System.out.println("Starting a program...");
		long start = System.currentTimeMillis();
		PrintTableWithNewThreads thread1 = new PrintTableWithNewThreads(1);
		System.out.println("Thread executing a task is - "+Thread.currentThread().getName());
		System.out.println("The thread 1 state is : "+thread1.getState());
		thread1.start();
		System.out.println("The thread 1 state is :"+thread1.getState());
		
		
			System.out.println("");
			try {
				thread1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			PrintTableWithNewThreads thread2 = new PrintTableWithNewThreads(2);
			System.out.println("Thread executing a task is - "+Thread.currentThread().getName());
			thread2.start();
			
			PrintTableWithNewThreads thread3 = new PrintTableWithNewThreads(3);
			System.out.println("Thread executing a task is - "+Thread.currentThread().getName());
			thread3.start();
			
			System.out.println("The thread 2 state is :" +thread2.getState());
			System.out.println("The thread 3 state is :" +thread3.getState());
			
			System.out.println("Program completion time: "+(System.currentTimeMillis()-start));
			
		
		
	}

}
