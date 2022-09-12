package Selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandlesDemo {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver",
				  "C:\\Users\\jeevank.suresh\\Downloads\\edgedriver_win64\\msedgedriver.exe");
				  
				  driver=new EdgeDriver();
				  
				  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				  driver.manage().window().maximize();
				  Thread.sleep(2000);
				  
				  driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[1]")).click();
				  driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[3]")).click();
				  driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[4]")).click();
				  System.out.println("started");
				  Set<String> handles = driver.getWindowHandles();
				  List<String> whandles = new ArrayList<String>(handles);
				 
				  if(SwitchWindowsHandles("YouTube", whandles));
				  System.out.println("Test"+driver.getCurrentUrl());
				  
				 
	} 
	public static boolean SwitchWindowsHandles(String windowHandle, List<String> whandles) throws InterruptedException {
		
		for (String windowHandles1 : whandles) {
			Thread.sleep(2000);
			String Title = driver.switchTo().window(windowHandles1).getTitle();
			
			if(Title.contains(windowHandle)) {
				System.out.println("Required window has found");
				
				return true;
			}
			
		}
		return false;
	}
	

				  
				  

	}



