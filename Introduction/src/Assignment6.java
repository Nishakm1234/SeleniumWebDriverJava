import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		
		Thread.sleep(1000);
		//To print column count
		System.out.println(driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/th")).size());
		
		//To print rows count
		System.out.println(driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).size());
		
		//To print second rows
		System.out.println(driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[3]")).getText());
	}

}
