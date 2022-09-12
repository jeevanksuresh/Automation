package com.attra.threads;

public class WorkerThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("This is sending  message");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
