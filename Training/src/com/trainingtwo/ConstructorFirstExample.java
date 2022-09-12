package com.trainingtwo;

public class ConstructorFirstExample {
	int x=5;
	
public ConstructorFirstExample(int x) {
	super();
	this.x=x;
}
	public static void main(String[] args) {
		ConstructorFirstExample ConstructorFirstExample = new ConstructorFirstExample(99); // Create an object of class main (This will call the constructor)
		System.out.println(ConstructorFirstExample.x);// Print the value of x
	}

	}

