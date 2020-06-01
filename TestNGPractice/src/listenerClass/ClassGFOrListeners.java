package listenerClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listenerClass.lisnersss.class)
public class ClassGFOrListeners {
	WebDriver driver;
	
	@Test
	public void LaunchGoogle() {
		

	System.setProperty("webdriver.chrome.driver", "C:\\selenium jars\\chromedriver_win32\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.getTitle();
	Assert.assertEquals(driver.getTitle(), "Google");
}
	@Test
	public void Launchyahoo() {
		

	System.setProperty("webdriver.chrome.driver", "C:\\selenium jars\\chromedriver_win32\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.yahoo.com/");
	driver.getTitle();
	Assert.assertEquals(driver.getTitle(), "Google");
	
	}
	
}