import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
		//Using CSS selector
		//driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		
		//Using xPath
		//driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
		
		//Using xPath index values
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		
		//driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@gmail.com");
		
		//Using CSS Selector index
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
		
		//Using xPath //ParentTagname/ChildTagname
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9448378909");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		//Using CSS selector parentTagname childTagname
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		//Using xPath combination of using class name, index and child tagname
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		
		//Using CSS Selector-> Regular expression
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		
		//Using ID locator
		driver.findElement(By.id("chkboxOne")).click();
		
		//Using xPath-> Regular expression
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
	}

}
