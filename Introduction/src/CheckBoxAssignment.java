import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		System.out.println(driver.findElements(By.xpath("//*[@type='checkbox']")).size());
		
		
	}

}
