 package dataProvider;

import org.testng.annotations.DataProvider;

public class CustomdataProvider {

	@DataProvider(name = "loginDetails")
	public static Object[][] getData() 
	{
		Object[][] arr = ExcelReader.getDataFromSheet("Login");
		return arr;
	}
	
	
	@DataProvider(name = "RegisterDetails")
	public static Object[][] getDetails() 
	{
		Object[][] arr = ExcelReader.getDataFromSheet("Register");
		return arr;
	}

}