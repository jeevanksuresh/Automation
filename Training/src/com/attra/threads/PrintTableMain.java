package com.attra.threads;

public class PrintTableMain {

	public static void main(String[] args) {
		long startTime =System.currentTimeMillis();
		System.out.println("Start the program execution....");
		
		PrintTable printTable = new PrintTable(3);
		System.out.println("Thread executing a task is - "+Thread.currentThread().getName());
		printTable.print(3);
		
		PrintTable print = new PrintTable(6);
		System.out.println("Thread executing a task is - "+Thread.currentThread().getName());
		print.print(2);
		
		System.out.println("Complete with time of"+ (System.currentTimeMillis() - startTime));
		
	}
}
