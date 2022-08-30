package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class ValidateTitle extends base {
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException {
		driver=initializeDriver();
		log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to home page");
	}
	@Test
	public void basePageNavigation() throws IOException{
		
		//One is inheritance
		//Creating object to that class and invoke methods of it
		LandingPage l=new LandingPage(driver);
		//Compare the text from the browser with actual text
		Assert.assertEquals(l.getTitle().getText(), "FEATURED123 COURSES");
		log.info("Successfully validated the Text message");
		
	}
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
