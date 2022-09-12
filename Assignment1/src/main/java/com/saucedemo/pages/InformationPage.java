package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class InformationPage {
    
WebDriver driver;
    
    public InformationPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
        
    }



   @FindBy(xpath="//input[@id=\"first-name\"]")
    WebElement FirstName;



   @FindBy(xpath="//input[@id=\"last-name\"]")
    WebElement LastName;



   @FindBy(xpath="//input[@id=\"postal-code\"]")
    WebElement ZIPCode;



   @FindBy(xpath="//input[@id=\"continue\"]")
    WebElement Continue;
    
    public OverviewPage enterDetails(String firstname, String lastname, String zip) throws InterruptedException {
        FirstName.sendKeys(firstname);
        Thread.sleep(2000);
        LastName.sendKeys(lastname);
        Thread.sleep(2000);
        ZIPCode.sendKeys(zip);
        Thread.sleep(2000);
        Continue.click();
        Thread.sleep(2000);
        
        return new OverviewPage(driver);
        
        
    }

    }




