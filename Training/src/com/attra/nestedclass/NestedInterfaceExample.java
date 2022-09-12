package com.attra.nestedclass;

public class NestedInterfaceExample implements Printer.samsung{
	public static void main(String[] args) {
		System.out.println("Program starting....");
		
		Printer.samsung obj = new NestedInterfaceExample();
		obj.print();
		
		System.out.println("Program completed successfully...");
		
	
}

	@Override
	public void print() {
		System.out.println("Printing your documents...");
		
		
	}
}
