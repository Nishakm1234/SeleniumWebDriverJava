import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollingWithTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//To scroll the window so that the table will be visible
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");//check it in console window
		
		Thread.sleep(3000);
		
		//To scroll the table
		//querySelector is similar to CSS selector
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=1000");//check it in console window
		
		//To find the 4th column in the table
		List<WebElement>values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		for(int i=0;i<values.size();i++) {
			//values.get(i).getText();//To fetch the values present in each row in the form of text
			//Need to parse it to Integer since we need to calculate the sum
			//System.out.println(Integer.parseInt(values.get(i).getText()));
			sum=sum+Integer.parseInt(values.get(i).getText());
		}
		System.out.println(sum);
		//To extract the total value present in page and compare it with the sum we obtained
		int total=Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		Assert.assertEquals(sum, total);
	}

}
