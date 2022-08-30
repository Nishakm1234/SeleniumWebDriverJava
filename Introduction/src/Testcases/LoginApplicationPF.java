package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.RediffHomePage;
import objectRepository.RediffHomePagePF;
import objectRepository.RediffLoginPage;
import objectRepository.RediffLoginPagePF;

public class LoginApplicationPF {
	@Test
	public void login() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
	//Login Page
	RediffLoginPagePF rd=new RediffLoginPagePF(driver);
	rd.emailID().sendKeys("Hello");
	rd.password().sendKeys("hello123");
	rd.submit().click();
	rd.home().click();
	
	//HomePage
	RediffHomePagePF rh=new RediffHomePagePF(driver);
	rh.search().sendKeys("rediff");
	rh.submit().click();
	}
}
