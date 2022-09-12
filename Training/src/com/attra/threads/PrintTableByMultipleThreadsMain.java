package com.attra.threads;

public class PrintTableByMultipleThreadsMain {

	public static void main(String[] args) {
		
		System.out.println("Start the program execution....");
		
		PrintTableWithNewThreads printTable = new PrintTableWithNewThreads(3);
		System.out.println("Thread executing a task is - "+Thread.currentThread().getName());
		printTable.start();
		
		PrintTableWithNewThreads run = new PrintTableWithNewThreads(4);
		System.out.println("Thread executing a task is - "+Thread.currentThread().getName());
		run.start();
		
	}
}