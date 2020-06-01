package test1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class facebokLoginPageVarification {
	WebDriver driver;
	@BeforeClass
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium jars\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
	
	@Test(priority=1)
	public void LoginTest() {
		driver.findElement(By.name("firstname")).sendKeys("java ");
		driver.findElement(By.name("lastname")).sendKeys("selenium");
		driver.findElement(By.name("reg_email__")).sendKeys("selenium@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("java123");
		
	}
	
	@Test(priority=2)
	public void select_Date() {
		WebElement date= driver.findElement(By.id("day"));
		Select s=new Select(date);
	System.out.println(s.getOptions().size());
	
	List list = new ArrayList();
	List<WebElement> obj= s.getOptions();
	
	for(WebElement d:obj)
	{
		list.add(d.getText());
	}
	System.out.println(list);
	
	}
	
	@Test(priority=3)
	public void month() {
		
	WebElement month = driver.findElement(By.id("month"));
	Select sel = new Select(month);
	System.out.println(sel.getOptions().size());
	List list1 =new ArrayList();
	List<WebElement> obj1= sel.getOptions();
	
	for(WebElement m:obj1)
	{
		list1.add(m.getText());
	}
	System.out.println(list1);
	sel.selectByIndex(6);
	
	WebElement year=driver.findElement(By.id("year"));
	Select select =new Select(year);
	System.out.println(select.getOptions().size());
	List list2= new ArrayList();
	List<WebElement> obj3 =select.getOptions();
	
	for(WebElement y:obj3)
	{
		list2.add(y.getText());
	}
	System.out.println(list2);
	}
	
	@Test(priority=4)
	public void redioButtonClick() {
	WebElement redioButton =driver.findElement(By.xpath("//*[@id=\'u_0_6\']"));
	System.out.println(redioButton.isSelected());
	redioButton.click();
	System.out.println(redioButton.isSelected());
	}
}
