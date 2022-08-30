import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.findElement(By.name("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.name("password")).sendKeys("learning");
		driver.findElement(By.xpath("//span[contains(text(),' User')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		WebElement staticDropdown=driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropdown=new Select(staticDropdown);
		dropdown.selectByVisibleText("Consultant");
		driver.findElement(By.id("terms")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInBtn")));
		driver.findElement(By.id("signInBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		List <WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));

		for(int i =0;i<products.size();i++){
			products.get(i).click();
		}
		driver.findElement(By.partialLinkText("Checkout")).click();
	}

}
