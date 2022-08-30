import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RadioBoxDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscoun']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscoun']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscoun']")).isSelected());
		//Count the number of checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='CheckBox']")).size());
		//To check if return date is disabled
		//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click(); //To enable round trip
		//To check if return date is enabled after selecting round trip
		//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("It is enabled");
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
				
		

	}

}
