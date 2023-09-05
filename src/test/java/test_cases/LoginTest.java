package test_cases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.LoginPage;
//import Pages.Home;
//import Pages.Login;
//import Pages.Register;
import base.BaseClass;
import browser_factory.browserFactory;
import dataProvider.CustomdataProvider;


public class LoginTest extends BaseClass {
	
 
	@Test (dataProvider = "loginDetails",dataProviderClass =CustomdataProvider.class)
	public void  loginToApplication(String uname,String upass) throws InterruptedException
	{
		
		LoginPage login = new LoginPage(driver); 
		login.ClickOnLoginBtn();
		
		login.loginToApplication( uname,  upass);
		
	 
		
		 
	 
	}
  
   }

