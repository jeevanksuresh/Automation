package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumAlert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver",
				  "C:\\Users\\jeevank.suresh\\Downloads\\edgedriver_win64\\msedgedriver.exe");
				  
				  WebDriver driver=new EdgeDriver();
				  
				  driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
				  driver.manage().window().maximize();
				  Thread.sleep(2000);
				  
				  driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
				  
				  driver.findElement(By.xpath("//button[text()='Try it']")).click();
				  
				  
				  
	}

}
