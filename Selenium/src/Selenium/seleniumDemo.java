package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class seleniumDemo {

	public static void main(String[] args) throws InterruptedException {
		
		
		  System.setProperty("webdriver.edge.driver",
		  "C:\\Users\\jeevank.suresh\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		  
		  WebDriver driver=new EdgeDriver();
		  
		  driver.get("https://intranet.attra.com/intranet/");
		  
		  //Thread.sleep(2000);
		  
		  //driver.findElement(By.xpath("//input[@name='txtuser']")).sendKeys("Jeevank.suresh");
		  //Thread.sleep(3000);
		  
		 // driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		 // Thread.sleep(3000);
		  
		 // driver.findElement(By.xpath("//input[@type='submit']")).click();
		 // Thread.sleep(3000);
		  
		  JavascriptExecutor jse = (JavascriptExecutor) driver;
		  WebElement element1 = (WebElement) jse.executeScript("return document.getElementById('txtuser');");
		  element1.sendKeys("Jeevan");
	
		  WebElement element2 = (WebElement) jse.executeScript("return document.getElementById('txtpassword');");
		  element2.sendKeys("123456");
	
	}

	
	
}
