import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsCookies {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		//To maximize the window
		driver.manage().window().maximize();
		
		//To delete all cookies
		driver.manage().deleteAllCookies();
		
		//To delete a particular cookie
		//driver.manage().deleteCookieNamed("abcdfffhgh");
		//Special example
		//driver.manage().deleteCookieNamed("sessionKey");
		//Click on any link
		//Login page-verify login url
		
	}

}
