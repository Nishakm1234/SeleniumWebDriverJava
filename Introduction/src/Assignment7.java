import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> options=driver.findElements(By.cssSelector(".ui-menu-item-wrapper"));
		for(WebElement option : options) {
			if(option.getText().equalsIgnoreCase("Indonesia")) {
				option.click();
				break;
			}
		}

	}

}
