package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium jars\\chromedriver_win32\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div[2]/div/form/div[2]/button")).click();
	}
	
	@Test(priority=1)
	public void date() throws InterruptedException {
		
		Thread.sleep(4000);
	WebElement from =	driver.findElement(By.xpath("//*[@id=\'origin\']/span/input"));
	from.sendKeys("Pune");
	driver.findElement(By.className("ng-star-inserted")).click();
	
WebElement to =	driver.findElement(By.xpath("//*[@id=\'destination\']/span/input"));
Thread.sleep(9000);
to.sendKeys("Thane");
WebElement distination2 = 	driver.findElement(By.className("ng-star-inserted"));

distination2.click();	
driver.close();
	
	}
	
	@Test(dependsOnMethods = {"date"},priority=2)
	public void calender() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\'divMain\']/div/app-main-page/div[1]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[3]/p-calendar/span/input")).click();
		driver.findElement(By.xpath("//*[@id=\'divMain\']/div/app-main-page/div[1]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[3]/p-calendar/span/div/div/a[2]")).click();
	    driver.findElement(By.linkText("23")).click();
	    driver.findElement(By.xpath("//*[@id=\'journeyClass\']/div/div[3]/span")).click();
	    driver.findElement(By.xpath("//*[@id=\'journeyClass\']/div/div[4]/div/ul/li[11]/span")).click();
	    driver.findElement(By.xpath("//*[@id=\'divMain\']/div/app-main-page/div[1]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[6]/div[1]/label")).click();
        driver.findElement(By.xpath("//*[@id=\'divMain\']/div/app-main-page/div[1]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[7]/button")).click();
	     Thread.sleep(9000);
	
	
	}
	
	@AfterMethod
	public void CloseB() {
		driver.close();
	}
}
