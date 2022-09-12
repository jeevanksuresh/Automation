package com.attra.assignment2;

import java.util.Scanner;



public class Calculator {



    float a,b;
     
     public Calculator(float a, float b) {
        super();
        this.a = a;
        this.b = b;
    }

    

    public Calculator() {
         
     }
     
    public void add(float a, float b) {
    	this.a=a;
    	this.b=b;
    	
         System.out.println("The sum is: "+ (a+b));
     };
    
     public void subtract(float a, float b) {
     	this.a=a;
     	this.b=b;
     	
         System.out.println("The difference is: "+ (a-b));
     };
    
     public void multiply(float a, float b) {
     	this.a=a;
     	this.b=b;
     	
         System.out.println("The product is: "+ (a*b));
     };
    
     public void divide(float a, float b) {
     	this.a=a;
     	this.b=b;
     	
         System.out.println("The quotient is: "+ (a/b));
     };
     
     
    public float getA() {
        return a;
    }



   public void setA(float a) {
        this.a = a;
    }



   public float getB() {
        return b;
    }



   public void setB(float b) {
        this.b = b;
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
        Calculator calc = new Calculator();
        calc.add(p,q);
        calc.subtract(p,q);
        calc.multiply(p,q);
        calc.divide(p,q);
        
    }



}
