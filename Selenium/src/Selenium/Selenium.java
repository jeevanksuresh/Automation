package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\jeevank.suresh\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		
	WebDriver	driver = new EdgeDriver();
	
	driver.get("https://intranet.attra.com/intranet/");
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Jeevank.suresh");
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@id=\"txtpassword\"]")).sendKeys("123456");
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@type='text']")).click();
	
	
	
	
	}

}
