package DataMethod;

import org.testng.annotations.DataProvider;

public class DataproviderMethod {

	
	@DataProvider(name="TestCase")
	public static Object[][] Logincase(){
		Object[][] data=new Object[4][2];
		
		data[0][0]="username1";
		data[0][1]="password1";
		System.out.println(".......................................");
		
		data[1][0]="username2";
		data[1][1]="password2";
		System.out.println(".......................................");
		
		data[2][0]="username3";
		data[2][1]="password3";
		System.out.println(".......................................");
		
		data[3][0]="username4";
		data[3][1]="password4";
		System.out.println(".......................................");
		
		return data;
	}
}
