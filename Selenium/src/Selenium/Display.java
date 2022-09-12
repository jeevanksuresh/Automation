package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Display {

	public static void main(String[] args) {
System.setProperty("webdriver.edge.driver", "C:\\Users\\jeevank.suresh\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.guru99.com/xpath-selenium.html#11");
		
		WebElement d = driver.findElement(By.xpath("//*[@id=\"post-987\"]/div/div/p[32]/img"));
		
		System.out.println(d.isDisplayed());
		
		
	}

}
