import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivites {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		
		//.get() will wait until page is loaded completely,by default it has implicit wait-> so it is generally used
		driver.get("https://www.google.com");
		
		//.navigate() will not wait until it loads completely, need to add implicit or explicit wait or thread sleep
		driver.navigate().to("https://rahulshettyacademy.com");
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
	}

}
