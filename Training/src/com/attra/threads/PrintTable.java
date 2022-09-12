package com.attra.threads;

public class PrintTable  {
	int n;
	
	
	public PrintTable(int n) {
		super();
		this.n = n;
	}

	
	public void print(int n) {
		
		System.out.println("Printing the table...");
		
		for(int i=1; i<=10; i++) {
			
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(i*n);

	}

	}}
