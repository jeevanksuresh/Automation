package com.attra.threads;

public class DeamonThread {

	public static void main(String[] args) {
		
		System.out.println("Starting a program...");
		
		//long start = System.currentTimeMillis();
		PrintTableWithNewThreads thread1 = new PrintTableWithNewThreads(1);
		System.out.println("Thread executing a task is - "+Thread.currentThread().getName());
		System.out.println("The thread 1 state is : "+thread1.getState());
		System.out.println("Is thread1 is Deamon thread" + thread1.isDaemon());
		
		System.out.println("Is main thread a Daemon" + Thread.currentThread().isDaemon());
		thread1.setDaemon(true);
		System.out.println("Is thread1 is Daemon thread" + thread1.isDaemon());
		System.out.println("Is main thread a Daemon "+ Thread.currentThread().isDaemon());
		
	}

}
