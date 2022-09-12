package com.attra.nestedclass;

public class StaticInnerClass {

	static int started = 2000;
	String org = "Attra";
	
	public static void main(String[] args) {
		System.out.println("Program started....");
		InnerClass InnerClass = new StaticInnerClass.InnerClass();
		InnerClass.printOrgDetails();
		System.out.println("Program terminated...");
		}

	static class InnerClass{
		static void printOrgDetails() {
			System.out.println("The Organization was started in "+ started);
			empDetails();
		}
	}
	
	public static void empDetails() {
		System.out.println("Printing the employee details...");
	}
}
