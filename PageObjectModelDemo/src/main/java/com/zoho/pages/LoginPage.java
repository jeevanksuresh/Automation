package com.zoho.pages;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
WebDriver driver;
public static org.apache.logging.log4j.Logger log = LogManager.getLogger(LoginPage.class.getName());

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="login_id")
	WebElement enterEmail;
	
	@FindBy(xpath="//button[@id=\"nextbtn\" and @class=\"btn blue\"]")
	WebElement nextButton;
	
	@FindBy(xpath ="//input[@id=\"password\"]")
	WebElement enterpassword;
	
	public AppsPage logIn(String username, String password) {
		enterEmail.sendKeys(username);
		nextButton.click();
		enterpassword.sendKeys(password);
		nextButton.click();
		 log.info("Logger Message");
		  log.debug("Debug Message");
		  log.error("Error Message");
		  log.fatal("Fatal Message");
		 
		
		
		return new AppsPage(driver);
		
		
	}
	
	
	
	

	
	
	
	
	
}
