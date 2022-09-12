package com.attra.threads;

public class PrintTableWithNewThreads1 extends Thread {
	int n;
	
	
	public PrintTableWithNewThreads1(int n) {
		super();
		this.n = n;
	}


	@Override
	public void run() {
		print(n);
	}
	
	
	public void print(int n) {
		long startTime =System.currentTimeMillis();
		System.out.println("Printing the table...");
		
		System.out.println("Thread executing a task is -"+Thread.currentThread().getName());
		for(int i=1; i<=5; i++) {
			try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Executed by" + Thread.currentThread().getName()+ " : "+ i*n);

	}
		System.out.println("Complete with time of"+ (System.currentTimeMillis() - startTime));
		
	}}
