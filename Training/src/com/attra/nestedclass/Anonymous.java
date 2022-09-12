package com.attra.nestedclass;

public class Anonymous {

	public static void main(String[] args) {

		int data = 5;
		System.out.println("Starting the program execution...");
		
		Ekart ekart = new Ekart() {
			@Override
			void addItem() {
				System.out.println(data + " Items is added to the ekart...");
			}
		};
		
		System.out.println("Invoking the anonymous class from the ourter");
		ekart.addItem();
		System.out.println("Program terminated...");
	}

}
