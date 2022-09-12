package com.attra.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threadpool {
	
	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		ExecutorService service = Executors.newFixedThreadPool(5);
		
		for (int i = 0; i < 10; i++) {
			WorkerThread threds = new WorkerThread();
			service.execute(threds);;
		}
		//closing/terminating the service..
		service.shutdown();
		System.out.println("Finished sending SMS" + (System.currentTimeMillis() - startTime));
		
	}
}
