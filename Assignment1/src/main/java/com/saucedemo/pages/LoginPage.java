package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(id="user-name")
	WebElement enterUsername;
	
	@FindBy(id="password")
	WebElement enterPassword;
	
	@FindBy(xpath = "//input[@class='submit-button btn_action']")
	WebElement Login;
	
	public ProductPage logIn(String username, String password) {
		enterUsername.sendKeys(username);
		enterPassword.sendKeys(password);
		Login.click();
		
		return new ProductPage(driver);
	}
	
	
	
	

}
