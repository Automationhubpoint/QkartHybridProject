package Pages;

import java.sql.Timestamp;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {
	
	
WebDriver driver;
String lastGeneratedUsername ;
String test_data_username;
	
	public RegisterPage (WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	 By registerBtn =  By.xpath("//button[contains(text(),'Register')]");
	 By username_txt_box =  By.id("username");
	 By password_txt_box =  By.id("password");
	 
	 By confirm_password_txt_box =  By.id("confirmPassword");
	 By register_now_button =  By.className("button");
	 
	 
	 
	 
	 public void clickonRegister()
	 {
		 driver.findElement(registerBtn).click();
	 }
	 
	 
	 
	 public void RegisterToApplication (String Username, String Password, Boolean makeUsernameDynamic)
	 {
		 
		 
		 Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			
			       
			       if (makeUsernameDynamic)
			           // Concatenate the timestamp to string to form unique timestamp
			           test_data_username = Username + "_" + String.valueOf(timestamp.getTime());
			       else
			           test_data_username = Username;
		 driver.findElement(username_txt_box).sendKeys(test_data_username);
		 driver.findElement(password_txt_box).sendKeys(Password);
		 driver.findElement(confirm_password_txt_box).sendKeys(Password);
		 
		 
	 }
	 
	 public void click_on_Register_Now_btn()
	 {
		 driver.findElement(register_now_button).click();
	 }
	 
	 
	 public boolean check_Register_completed(){
		 
		 
		 try {
	           WebDriverWait wait = new  WebDriverWait(driver, Duration.ofSeconds(30));
           wait.until(ExpectedConditions.or(
	               ExpectedConditions.urlToBe("https://crio-qkart-frontend-qa.vercel.app/login")));
	       } catch (TimeoutException e) {
	           return false;
	       }
		  
		
	        return this.driver.getCurrentUrl().endsWith("/login");
		 
	 }
	 
	 
	 public String Last_generated_username ()
	 {
		 lastGeneratedUsername = test_data_username;
		 return  lastGeneratedUsername ;
		 
	 }
	 
	
	
	 
	
	
	
	

}
