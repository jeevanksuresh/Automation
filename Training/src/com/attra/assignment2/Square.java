package com.attra.assignment2;

import java.util.Scanner;



public class Square implements Shape {



   int a;



   @Override
    public void getArea(int a) {
        this.a = a;
    }



   public Square(int a) {
        super();
        this.a = a;
        System.out.println("The area of the square is: " + (a * a) + " sq cm");
    }



   public static void main(String[] args) {



       Scanner x = new Scanner(System.in);
        System.out.println("Please enter the length of one side of the sqaure (in cm):");
        int p = x.nextInt();
        Square sq = new Square(p);
        x.close();



   }



}