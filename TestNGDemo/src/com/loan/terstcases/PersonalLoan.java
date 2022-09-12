package com.loan.terstcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PersonalLoan {
	
	@Test(groups= {"Smoke"})
	public void webPagePersonalLoan() {
		
		System.out.println("Webpage Personal Loan");

}
	
	@Parameters("URL")
	@Test
	public void mobilePagePersonalLoan(String URL) {
		
		System.out.println("Mobilepage Personal Loan");
		
		System.out.println(URL);

}
	
	@Test
	public void apiPersonalLoan() {
		
		System.out.println("Apipage Personal Loan");

}


}
