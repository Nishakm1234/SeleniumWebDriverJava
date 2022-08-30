import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;//import from official website

public class RelativeLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//Usage of above
		WebElement nameEditBox=driver.findElement(By.cssSelector("[name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
		
		//Usage of below
		WebElement dateOfBirth=driver.findElement(By.cssSelector("[for='dateofBirth']"));
		//flex elements will not be supported by relative locators, so the next input tag i.e submit button will be clicked
		driver.findElement(with(By.tagName("input")).below(dateOfBirth)).click();//submit is being clicked
		
		//Usage of toLeftOf
		WebElement iceCreamLabel=driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamLabel)).click();
		
		//Usage of toRightOf
		WebElement rdb=driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText());
		
	}

}
