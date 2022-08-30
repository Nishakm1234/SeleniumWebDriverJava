import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck {

	public static void main(String[] args) {
		//In Firefox -> FirefoxOptions
		//In Edge-> EdgeOptions
		//In Chrome -> ChromeOptions
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		//To set proxy
		//Proxy proxy=new Proxy();
		//proxy.setHttpProxy("ipaddress:4444");//need to check with network guy regarding the argument to be passed
		//options.setCapability("proxy", proxy);
		
		//To set the download directory
		//Map<String, Object> prefs = new HashMap<String, Object>();
		//prefs.put("download.default_directory", "/directory/path");
		//options.setExperimentalOption("prefs", prefs);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		

	}

}
//Refer: https://chromedriver.chromium.org/capabilities