package com.attra.training;

import java.util.Scanner;

public class Samplerelationaloperators {

	public static void main(String[] args) {
		int a,b;
		Scanner x = new Scanner(System.in);
		Scanner y = new Scanner(System.in);
		System.out.println("Please eneter the first number");
		a = x.nextInt();
		System.out.println("Please enter the second number");
		b = y.nextInt();
		if (a<b)
			System.out.println("less than");
		else if (a>b)
			System.out.println("greater than");
		else
			System.out.println("equal");
	}

}
