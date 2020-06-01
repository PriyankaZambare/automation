package listenerClass;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class lisnersss implements ITestListener  {

	
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test started.....");
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test Failure.....");
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test skipped.....");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test successful.....");
	}
}
