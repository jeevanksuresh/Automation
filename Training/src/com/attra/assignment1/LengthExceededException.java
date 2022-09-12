package com.attra.assignment1;

import java.util.Scanner;

public class LengthExceededException extends Exception {

	public LengthExceededException(String h) {
        super(h);
    }



   public static void main(String[] args) throws LengthExceededException {



       String st;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your input string : ");
        st = sc.next();



       if (st.length() > 4) {
        throw new LengthExceededException("String Length exceeded.. Please check");
            



       }
        System.out.println("Your string name is : " + st);



   }
}


