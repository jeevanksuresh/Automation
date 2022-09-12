package com.attra.assignment1;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("The prime numbers between 1 & 100 are");
		
		int a, b, count;

			for (b = 2; b <= 100; b++) {
	            count = 0;

	            for (a = 1; a <= b; a++) {
	                if (b % a == 0) {
	                    count++;
	                }
	            }

	            if (count == 2)
	                System.out.println(b + " ");
	        }

 }

}
    


