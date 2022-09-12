package com.loan.terstcases;

import org.testng.annotations.Test;

public class EducationLoan {
	
	@Test(groups= {"Smoke"}, enabled = false, timeOut = 4000)
	public void webPageEducationLoan() {
		
		System.out.println("Webpage Education Loan");

}
	
	@Test
	public void mobilePageEducationLoan() {
		
		System.out.println("Mobilepage Education Loan");

}
	
	@Test
	public void apiEducationLoan() {
		
		System.out.println("Apipage Education Loan");

}


}
