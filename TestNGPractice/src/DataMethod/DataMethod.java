package DataMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataMethod {
	WebDriver driver;
	@Test(dataProvider="TestCase",dataProviderClass = DataproviderMethod.class)
	public void OpenBrowser(String Username,String Password) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium jars\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=110");
		driver.findElement(By.id("email")).sendKeys(Username);
		driver.findElement(By.id("pass")).sendKeys(Password);
		
	}
	

}
