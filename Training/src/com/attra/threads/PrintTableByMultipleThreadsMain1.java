package com.attra.threads;

public class PrintTableByMultipleThreadsMain1 {

		public static void main(String[] args) {
			
			
			System.out.println("Start the program execution....");
			PrintTableWithNewThreads1 printTable = new PrintTableWithNewThreads1(3);
			System.out.println("Thread executing a task is - "+Thread.currentThread().getName());
			printTable.start();
			
			System.out.println("Started the program execution...");
			PrintTableWithNewThreads1 printTable1 = new PrintTableWithNewThreads1(2);
			System.out.println("Thread executing a task is - "+Thread.currentThread().getName());
			printTable1.start();
			
		}
	}