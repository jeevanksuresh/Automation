package com.loan.terstcases;

import org.testng.annotations.Test;

public class HomeLoan {
	
	@Test(groups= {"Smoke"})
	public void webPageHomeLoan() {
		
		System.out.println("Webpage Home Loan");

}
	
	@Test
	public void mobilePageHomeLoan() {
		
		System.out.println("Mobilepage Home Loan");

}
	
	@Test
	public void apiHomeLoan() {
		
		System.out.println("Apipage Home Loan");

}

	@Test (dependsOnMethods = "zTest")
	public void yTest() {
		
		System.out.println("YTest");

}
	
	@Test
	public void zTest() {
		
		System.out.println("ZTest");

}
}
