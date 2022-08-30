import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertionsDemo {

	public static void main(String[] args) {
		
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
				
				Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscoun']")).isSelected());
				//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscoun']")).isSelected());
				
				driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscoun']")).click();
				
				Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscoun']")).isSelected());
				//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscoun']")).isSelected());
				
				//Count the number of checkboxes
				System.out.println(driver.findElements(By.cssSelector("input[type='CheckBox']")).size());
	}

}
