package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoProgram3 {
	@BeforeClass
	public void BfClass() {
			System.out.println("Executed before any method present in this class is executed");
		}
	@Parameters({"URL"})
	@Test
public void WebLogInCarLoan(String urlname) {
	//Selenium
		System.out.println("weblogincar");
		System.out.println(urlname);
}
	@BeforeSuite
public void BfSuite() {
		System.out.println("I am First No.1");
	}
	@AfterClass
	public void AfClass() {
			System.out.println("Executed after any method present in this class is executed");
		}
	@BeforeMethod
	public void BfMethod() {
			System.out.println("I am before method executed before each method present in this class");
		}
	
	@AfterMethod
	public void AfMethod() {
			System.out.println("I am after method executed after each method present in this class");
		}
	@Test(groups={"Smoke"})
public void MobileLogInCarLoan() {
	//Apium
		System.out.println("mobilelogincar");
}
	@Test(timeOut=4000)
public void MobileLogOutCarLoan() {
	//Apium
		System.out.println("mobilelogoutcar");
}
	@Test(enabled=false)
public void MobileSignInCarLoan() {
	//Apium
		System.out.println("mobilesignincar");
}
	@Test(dataProvider="getData")
public void MobileSignOutCarLoan(String username,String password) {
	//Apium
		System.out.println("mobilesignoutcar");
		System.out.println(username);
		System.out.println(password);
}
	@Test(dependsOnMethods={"WebLogInCarLoan","MobileSignOutCarLoan"})
public void APILogInCarLoan() {
	//Rest API Automation
		System.out.println("APIlogincar");
}
	@DataProvider
	public Object[][] getData() {
		//1st combination-> Username and Password -> good credit history
		//2nd combination-> Username and Password -> no credit history
		//3rd combination-> Username and Password -> fraudulant credit history
		Object[][] data=new Object[3][2];//Object[No. of combinations][2 parameters-Username and password]
		//1st set
		data[0][0]="firstSetUserName";
		data[0][1]="firstpassword";
		//2nd set
		data[1][0]="secondSetUserName";
		data[1][1]="secondpassword";
		//3rd set
		data[2][0]="thirdSetUserName";
		data[2][1]="thirdpassword";
		return data;
	}
}
