package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	WebDriver driver;
	@Test(dataProvider = "LoginTest")
	public void openBrowser(String uname,String Pwd)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium jars\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=110");
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(Pwd);
	}
	
	@DataProvider (name="LoginTest")
	public Object[][] TestData()
	{
	Object [][] data =new Object[3][2];
	data[0][0]= "UserName1";
	data[0][1]="Password1";
	System.out.println("-------------------------------------------");
	
	data[1][0]= "UserName2";
	data[1][1]="Password2";
	
	
	data[2][0]= "UserName3";
	data[2][1]="Password3";
	
	
	
		
	return data;
	}
}
	