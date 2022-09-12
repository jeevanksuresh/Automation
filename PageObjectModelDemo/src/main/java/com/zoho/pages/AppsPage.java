package com.zoho.pages;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppsPage {

	public static org.apache.logging.log4j.Logger log = LogManager.getLogger(AppsPage.class.getName());	
WebDriver driver;
	
	public AppsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath = "//div[.='CRM' and @class=\"app-nm\"]")
	WebElement crm;
	
	public void clickcrm() {
		crm.click();
		 log.info("Logger Message");
		  log.debug("Debug Message");
		  log.error("Error Message");
		  log.fatal("Fatal Message");
		 
	}
	
}
