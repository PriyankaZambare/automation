package ExcelFormUsingDataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class automationTestingForm {
WebDriver driver;
String xlPath="";
String SheetName="";

	@BeforeMethod
	public void Natigate() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium jars\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
	}
	
	
}
