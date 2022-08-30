import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//Broken URL
		//Step1: To get all URLs tied up to the links using Selenium
		//String url=driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
		String url=driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		//Java methods will call URL's and gets you the status code
		//If status code >400 then that URL is not working -> link which tied to URL is broken
		HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int respCode=conn.getResponseCode();
		System.out.println(respCode);
	}

}
