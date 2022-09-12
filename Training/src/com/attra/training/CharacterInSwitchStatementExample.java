package com.attra.training;

import java.util.Scanner;

public class CharacterInSwitchStatementExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your grade");
		char a=sc.next().charAt(0);
		switch(a)
		{
		case 'A':System.out.println("100 marks");
		break;
		case 'B':System.out.println("90 marks");
		break;
		case 'C':System.out.println("80 marks");
		break;
		case 'D':System.out.println("70 marks");
		break;
		default:System.out.println("Re Attempt");
		
		}
	

	}

}
