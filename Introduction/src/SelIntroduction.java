import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver is the interface.
		//we need to implement only WebDriver methods so using WebDriver reference
		//WebDriver driver=new ChromeDriver();
		

		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Administrator\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://mvnrepository.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		//driver.quit();
	}

}
