package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	By login=By.xpath("//button[text()='Login']");
	
    By user=By.id("username");
	
	By pass=By.name("password");
	
	By loginbtn =By.xpath("//button[text()='Login to QKart']");
	
	
	public void ClickOnLoginBtn()
	{
		driver.findElement(login).click();
	}
	
	public void loginToApplication(String username,String password) throws InterruptedException
	{
		driver.findElement(user).sendKeys(username);
		driver.findElement(pass).sendKeys(password);
		
		Thread.sleep(3000);
		driver.findElement(loginbtn).click();
		
	}
	

}
