package test_cases;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Pages.RegisterPage;
import base.BaseClass;
import dataProvider.CustomdataProvider;

public class RegisterTest extends BaseClass {
	
	
	
	@Test(dataProvider = "loginDetails",dataProviderClass =CustomdataProvider.class,priority = 1)
	public void Register(String username ,String  password)throws InterruptedException
	{
		 boolean makeUsernameDynamic =true ;
		 boolean status =false ;
		RegisterPage Registration = new RegisterPage(driver) ;
		
		Registration.clickonRegister();
		Registration.RegisterToApplication(username, password,makeUsernameDynamic );
		Registration.click_on_Register_Now_btn();
	    status =Registration.check_Register_completed();
		 
		assertTrue( status, "Registration Failed ");
		
		
	}
	
	@Test(dataProvider = "loginDetails",dataProviderClass =CustomdataProvider.class,priority = 2)
	public void Re_Register (String username ,String  password)throws InterruptedException
	{
		 boolean makeUsernameDynamic =false ;
		 boolean status =false ;
		RegisterPage Registration = new RegisterPage(driver) ;
		
		Registration.clickonRegister();
		Registration.RegisterToApplication(username, password,makeUsernameDynamic );
		Registration.click_on_Register_Now_btn();
	    status =Registration.check_Register_completed();
		 
		assertFalse( status, "Registration should have failed instead got passed");
		
		
	}

}
