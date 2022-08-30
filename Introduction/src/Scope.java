import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//To get the count of links in a page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//To get the count of links in the footer section 
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));//Limiting webdriver scope
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//To get the count of links present in first column in footer section
		WebElement columndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		//To click on each link present in first column and check if pages are opening
		//Starting with 1 because link in 0th index is not working
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++) {
			//Use Ctrl+Enter to click on each link to open the pages in separate tabs
			String clickOnLinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			Thread.sleep(5000L);
		}
		
		//To get the title of each child tabs
		Set<String> abc=driver.getWindowHandles();
		Iterator<String> it=abc.iterator();
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
		}
		
	}

}
