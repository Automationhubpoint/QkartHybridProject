package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import browser_factory.browserFactory;
import dataProvider.ConfigReader;
//import dataProvider.ConfigReader;

public class BaseClass {
	
	
public WebDriver driver;
	
	@BeforeMethod
	public void setupBrowser()
	{
		System.out.println("LOG:INFO - Setting up browser");
		
		// 1- Config - Does not suite for cross browser
		driver= browserFactory.startBrowser(ConfigReader.getProperty("browser"),ConfigReader.getProperty("url"));
		 
		System.out.println("LOG:INFO - Application is up and running");
		

		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
		
		System.out.println("LOG:INFO - Closing the browser and application");
	}
	
}
	
	
	
	


