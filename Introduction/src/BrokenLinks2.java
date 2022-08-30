import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BrokenLinks2 {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		for(WebElement link:links) {
			String url=link.getAttribute("href");
			HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode=conn.getResponseCode();
			System.out.println(respCode);
			if(respCode>400) {
				System.out.println("The link with text "+link.getText()+" is broken with code "+respCode);
				Assert.assertTrue(false);//hard assert
				//Execution throws exception when broken link is encountered and stops its execution
				//Rest of the links after broken link is not checked
				//So need to use Soft asserts to overcome this issue
			}
		}
	}

}
