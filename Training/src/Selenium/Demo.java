package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.edge.driver","C:\\Users\\jeevank.suresh\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://google.com");
		
		//Thread.sleep(2000);
		
		driver.quit();
	}

}
