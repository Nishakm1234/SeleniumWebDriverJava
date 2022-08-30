import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingJavAlerts {

	public static void main(String[] args) {
		String name="Rahul";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("alertbtn")).click();
		
		//To switch context from browser to alerts and to grab text
		System.out.println(driver.switchTo().alert().getText());
		
		//To switch context from browser to alerts and accept is to click OK of alert
		driver.switchTo().alert().accept();
		
		//Confirm button-> has 2 options in alert OK and cancel
		driver.findElement(By.id("confirmbtn")).click();
		
		//To switch context from browser to alerts and to grab text
		System.out.println(driver.switchTo().alert().getText());
			
		//To switch context from browser to alerts and dismiss to click on cancel
		driver.switchTo().alert().dismiss();
		

	}

}
