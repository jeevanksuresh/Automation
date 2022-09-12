package com.attra.assignment2;

import java.util.Scanner;



public class Circle implements Shape {



   int a;



   @Override
    public void getArea(int a) {
        this.a = a;
    }



   public Circle(int a) {
        super();
        this.a = a;
        System.out.println("The area of the circle is: " + (3.14 * a * a) + " sq cm");
    }



   public static void main(String[] args) {



       Scanner x = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle (in cm):");
        int p = x.nextInt();
        Circle cir = new Circle(p);
        x.close();



   }



}
