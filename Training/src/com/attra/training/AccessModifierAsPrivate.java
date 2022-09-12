package com.attra.training;

class A{
	public int data=40;
	public void msg()
	{
		System.out.println("Hello Java");
	}
}

 public class AccessModifierAsPrivate {

	public static void main(String[] args) {
		A obj=new A ();
		System.out.println(obj.data);//Compile Time Error
		obj.msg();//Compile Time Error

	}

}

