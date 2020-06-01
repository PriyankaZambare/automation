package test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwtchTo {
	
	WebDriver driver;
	
	@BeforeMethod
	public void LauchBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium jars\\chromedriver_win32\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.formsite.com/templates/registration-form-templates/club-signup-form/");
    
}
	@Test
	public void Login() {
	
		driver.switchTo().frame(0);
		driver.findElement(By.id("RESULT_TextField-2")).sendKeys("abcdefg");
		WebElement ele= driver.findElement(By.id("RESULT_RadioButton-7"));
		Select s= new Select(ele);
		System.out.println(s.getOptions().size());
		List<WebElement> list= s.getOptions();
		
		for(WebElement e:list)
		{
			System.out.println(e.getText());
			if("Yukon".equals(e.getText()))
			{
				e.click();
			}
		}
		
		
		
		
	}
}