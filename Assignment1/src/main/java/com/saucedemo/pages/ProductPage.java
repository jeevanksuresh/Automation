package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ProductPage {
	
	WebDriver driver;
	public ProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

}
	@FindBy(id ="add-to-cart-sauce-labs-backpack")
	WebElement AddToCart1 ;
	@FindBy(xpath = "//button[@id =\"add-to-cart-sauce-labs-bike-light\"]")
	WebElement AddToCart2 ;
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	WebElement AddToCart ;
	

	
	public CartPage  AddToCart(){
	    
	    AddToCart2.click();
	    AddToCart1.click();
	    AddToCart.click();
	    return new CartPage(driver);
	    
	}
}