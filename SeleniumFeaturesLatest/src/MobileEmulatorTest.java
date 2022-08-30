import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v103.emulation.Emulation;

public class MobileEmulatorTest {
public static void main(String []args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
	//Use ChromeDriver instead of WebDriver
	ChromeDriver driver=new ChromeDriver();
	DevTools devTools=driver.getDevTools();
	devTools.createSession();
	//send command to CDP Methods-> CDP Methods will invoke and get access to chrome dev tools
	devTools.send(Emulation.setDeviceMetricsOverride(600,1000,50,true,Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty()));
	driver.get("https://rahulshettyacademy.com/angularAppdemo/");
	driver.findElement(By.cssSelector(".navbar-toggler")).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Library")).click();
}
}
