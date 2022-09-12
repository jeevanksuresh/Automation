package com.trainingStatic;

public class Employee {
int eid;//instance variable
String name;
static String company ="ATTRA";//static variable
//constructor

public void display() {
	System.out.println(eid+" "+name+" "+company);
}
public Employee(int eid, String name) {
	this.eid = eid;
	this.name= name;
}
}
