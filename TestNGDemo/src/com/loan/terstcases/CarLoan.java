package com.loan.terstcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CarLoan {
	
	@BeforeSuite
	public void beforesuite() {
		
		System.out.println("Iam the first one to execute Before suite");

}
	
	@AfterSuite
	public void aftersuite() {
		
		System.out.println("Iam first from the last After suite");

}
	
	@BeforeTest
	public void beforetest() {
		
		System.out.println("Before Test");

}
	
	@AfterTest
	public void aftertest() {
		
		System.out.println("After Test");

}
	
	@BeforeMethod
	public void beforemethod() {
		
		System.out.println("Before Method");

}
	
	@AfterMethod
	public void aftermethod() {
		
		System.out.println("After Method");
		}
	
	@Test
	public void webPageCarLoan() {
		
		System.out.println("Webpage Car Loan");

}
	
	
	@Test
	public void mobilePageCarLoan() {
		
		System.out.println("Mobilepage Car Loan");

}
	
	@Test
	public void apiCarLoan() {
		
		System.out.println("Apipage Car Loan");

}
}