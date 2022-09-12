package com.zoho.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver",
				  "C:\\Users\\jeevank.suresh\\Downloads\\edgedriver_win64\\msedgedriver.exe");
				  
				  WebDriver driver=new EdgeDriver();
				  
				  driver.get("https://demoqa.com/droppable");
				  driver.manage().window().maximize();
				  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
				  Thread.sleep(2000);
				  
				  WebElement drag = driver.findElement(By.id("draggable"));
				  WebElement drop = driver.findElement(By.id("droppable"));
				  
				  Actions actions = new Actions(driver);
				  actions.dragAndDrop(drag, drop).build().perform();
				  Thread.sleep(3000);
				  driver.quit();
}
}
