import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Nisha");
		driver.findElement(By.name("email")).sendKeys("nisha134@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Nisha@999");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement staticDropdown=driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown=new Select(staticDropdown);
		dropdown.selectByVisibleText("Female");
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("31-08-1997");
		driver.findElement(By.className("btn-success")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
		
	}

}
