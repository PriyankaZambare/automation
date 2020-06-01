package Demo_form;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataPickerEx {

	WebDriver driver;
	
	@BeforeMethod
	public void Natigate() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium jars\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.mobiscroll.com/jquery/forms/desktop-single-multi-column#");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	//	driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\'snippet-preview\']")));
	}
	
	
	@Test(priority=1)
	public void Datavalue() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("ASC@gmail.com");
		WebElement date= driver.findElement(By.id("pass"));
		date.sendKeys("11112012");
	}
	
	
	@Test(priority=2)
	public void select() {
	/*	WebElement sel= driver.findElement(By.id("state"));
		Select s= new Select(sel);
		System.out.println(s.getOptions().size());
		List list =new ArrayList();
		
		List<WebElement>web=s.getOptions();
		for(WebElement e: web)
		{
		list.add(e.getText());
             if("Delaware".equals(e.getText())) {
		
		          e.click();

		}
		System.out.println(list);
		
	}*/
		WebElement sel= driver.findElement(By.id("state"));
		Select s= new Select(sel);
		System.out.println(s.getOptions().size());
		List <WebElement> list=s.getOptions();
		for(WebElement e: list)
		{
			System.out.println((e.getText()));
		}
		
		
}
}
