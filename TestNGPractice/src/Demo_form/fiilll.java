package Demo_form;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class fiilll {
	WebDriver driver;
	
		@BeforeMethod
		public void Natigate() {
			System.setProperty("webdriver.chrome.driver", "C:\\selenium jars\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://parsleyjs.org/doc/examples/simple.html");
		}
	
		@AfterMethod
		public void closeB() {
			driver.close();
		}
		@Test
		public void LaunchBrowser() {
			WebElement ele =driver.findElement(By.id("heard"));
			Select s= new Select(ele);
		System.out.println(	s.getOptions().size());
			
			List list= new ArrayList();
		    List<WebElement> value= s.getOptions();
		    s.selectByVisibleText("Internet");
		    for(WebElement e: value)
		    {
		   	list.add(e.getText());
		   	
		   
		 
		    }
			System.out.println(list);
		}
}
