 package browser_factory;

import java.time.Duration;
 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


public class browserFactory {
	
	static WebDriver driver;
	
	public static WebDriver getBrowserInstance()
	{
		return driver;	
	}
	
	
	public static WebDriver startBrowser(String browserName,String applicationURL)
	{

		
		if(browserName.contains("Chrome") || browserName.contains("GC") || browserName.contains("Google Chrome"))
		{
//			System.setProperty( "webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe" );
//			 ChromeOptions option = new ChromeOptions();
//			 option.setBinary(System.getProperty("D:\\Software\\Chrome\\chrome-win64 (1)\\chrome-win64\\chrome.exe"));
		driver=new ChromeDriver();
		}
		else if(browserName.contains("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browserName.contains("Safari"))
		{
			driver=new SafariDriver();
		}
		else if(browserName.contains("Edge"))
		{
			driver=new EdgeDriver();
		}
		else {
//			System.setProperty( "webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe" );
//			 ChromeOptions option = new ChromeOptions();
//			 option.setBinary("D:\\Software\\Chrome\\chrome-win64 (1)\\chrome-win64\\chrome.exe");
			driver=new ChromeDriver();
			 
			 
		}
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(20));
		
		driver.get(applicationURL);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		return driver;
	}

}
