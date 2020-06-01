package Demo_form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demoqacom {
WebDriver driver;
@BeforeMethod
public void LauchBrowsr() {

	System.setProperty("webdriver.chrome.driver", "C:\\selenium jars\\chromedriver_win32\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/sortable/");
}

@Test(priority=1)
public void SelectMenu() {
WebElement drag=	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[2]/ul/li[1]"));

Actions act= new Actions(driver);
act.dragAndDropBy(drag, 50, 0).build().perform();        //////// / /// / //slider


}


}
