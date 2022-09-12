package com.zoho.testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SampleTestcase {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver",
				  "C:\\Users\\jeevank.suresh\\Downloads\\edgedriver_win64\\msedgedriver.exe");
				  
				  WebDriver driver=new EdgeDriver();
				  
				  driver.get("https://www.zoho.com/");
				  driver.manage().window().maximize();
				  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
				  Thread.sleep(2000);
				  
				  //Homepage
				  
				  driver.findElement(By.xpath("//a[.='Sign in']")).click();
				  driver.findElement(By.xpath("//input[@id=\"login_id\"]")).sendKeys("jeevank.suresh@attra.com.au");
				  driver.findElement(By.xpath("//button[@id=\"nextbtn\" and @class=\"btn blue\"]")).click();
				  driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Welcome@1808");
				  driver.findElement(By.xpath("//button[@id=\"nextbtn\" and @class=\"btn blue\"]")).click();
				  //App page
				  driver.findElement(By.xpath("//div[.='CRM' and @class=\"app-nm\"]")).click();
				  
				  
	}

}
