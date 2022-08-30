package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ForgotPassword;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;
public class HomePage extends base{
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException {
		driver=initializeDriver();
		
	}
@Test(dataProvider="getData")
public void basePageNavigation(String username,String password,String text) throws IOException {
	
	//One is inheritance
	//Creating object to that class and invoke methods of it
	driver.get(prop.getProperty("url"));
	LandingPage l=new LandingPage(driver);
	LoginPage lp=l.getLogin();
	//LoginPage lp=new LoginPage(driver);
	lp.getEmail().sendKeys(username);
	lp.getPassword().sendKeys(password);
	//System.out.println(text);
	log.info(text);
	lp.getLogin().click();
	ForgotPassword fp=lp.forgotPassword();
	fp.getEmail().sendKeys("xxx");
	fp.sendMeIntructions().click();
}

@DataProvider
public Object[][] getData() {
	//Row stands for how many different data types test should run
	//Column stands for how many values per each test
	Object[][] data=new Object[2][3];
	//0th row
	data[0][0]="nonrestricteduser@gb.com";
	data[0][1]="123456";
	data[0][2]="RestrictedUser";
	//1st row
	data[1][0]="restricteduser@gb.com";
	data[1][1]="45678";
	data[1][2]="NonRestrictedUser";
	
	return data;
}
@AfterTest
public void tearDown() {
	driver.close();
}
}
