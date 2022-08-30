import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarUI2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions/");
		
		//give a month and date August 23
		driver.findElement(By.id("travel_date")).click();
		
		//To select a month
		while(!driver.findElement(By.cssSelector("div[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("August")) {
			driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='next']")).click();
		}
		//To select date
		//Grab common attribute, put it into a list and iterate
		List<WebElement> dates=driver.findElements(By.className(".day"));
		int count=driver.findElements(By.className("day")).size();
		
		for(int i=0;i<count;i++) {
			String text=driver.findElements(By.className("day")).get(i).getText();
			if(text.equalsIgnoreCase("23")) {
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
	}

}
