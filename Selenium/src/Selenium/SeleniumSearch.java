package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumSearch {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\jeevank.suresh\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.guru99.com/xpath-selenium.html");
	
		
		WebElement add = driver.findElement(By.xpath("//*[@id=\"menu-item-3172\"]/a"));
		System.out.println(add.getText());
		add.click();
		
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("selenium");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class=\"gsc-search-button gsc-search-button-v2\"]")).click();
		
		
		
		
	}

}
