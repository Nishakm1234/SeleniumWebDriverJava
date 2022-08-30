import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v103.emulation.Emulation;

public class CDPCommandsTest {
public static void main(String []args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
	//Use ChromeDriver instead of WebDriver
	ChromeDriver driver=new ChromeDriver();
	DevTools devTools=driver.getDevTools();
	devTools.createSession();
	
	//To execute CDP commands directly
	Map deviceMetrics=new HashMap();
	deviceMetrics.put("width", 600);
	deviceMetrics.put("height", 1000);
	deviceMetrics.put("deviceScaleFactor", 50);
	deviceMetrics.put("mobile", true);
	driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrics);
	
	driver.get("https://rahulshettyacademy.com/angularAppdemo/");
	driver.findElement(By.cssSelector(".navbar-toggler")).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Library")).click();
}
}
