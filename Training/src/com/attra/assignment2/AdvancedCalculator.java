package com.attra.assignment2;

import java.util.Scanner;



public class AdvancedCalculator extends Calculator{



   public AdvancedCalculator(float a, float b) {
        super(a, b);
        
    }



   public AdvancedCalculator() {
        
    }
    
    public void squareroot(float a) {
        float c = (float) Math.sqrt(a);
        System.out.println("The Square Root is: "+c);
        
    }
    
    public void square(float a) {
        System.out.println("The Square is: "+(a*a));
    }
    
    public void modulus (float a, float b) {
    	this.a=a;
    	this.b=b;
        System.out.println("The Modulus is: "+(a%b));
    }
    
    
    
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);
        System.out.println("Please enter your first number : ");
        float p = x.nextFloat();
        System.out.println("please enter your second number : ");
        float q = y.nextFloat();
        x.close();
        y.close();
        AdvancedCalculator adv = new AdvancedCalculator();
        adv.square(p);
        adv.square(q);
        adv.squareroot(p);
        adv.squareroot(q);
        adv.setA(p);
        adv.setB(q);
        adv.add(p,q);
        adv.subtract(p,q);
        adv.multiply(p,q);
        adv.divide(p,q);
        adv.modulus(p,q);
    }



}
