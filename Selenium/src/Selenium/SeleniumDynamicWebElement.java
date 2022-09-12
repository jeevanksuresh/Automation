package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumDynamicWebElement {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver",
				  "C:\\Users\\jeevank.suresh\\Downloads\\edgedriver_win64\\msedgedriver.exe");
				  
				  WebDriver driver=new EdgeDriver();
				  
				  driver.get("https://www.makemytrip.com/");
				  driver.manage().window().maximize();
				  
				  driver.findElement(By.xpath("//input[@id='fromCity']")).click();
				  driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Pune");
				  Thread.sleep(3000);
				   List<WebElement> dynamicelement = driver.findElements(By.xpath("//div[@class='calc60']/p[1]"));
				   for(int i=0; i<=dynamicelement.size(); i++) {
					  String ele = dynamicelement.get(i).getText();
					  if(ele.equalsIgnoreCase("Pune"));
					  dynamicelement.get(i).click();
					   
				   }
				  
				  
				  
	}

}
