package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	public WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException {
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Administrator\\Nisha\\SeleniumTesting\\E2EProject\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			//Execute in Chrome driver
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			//Execute in firefox driver
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browserName.equals("Edge")) {
			//Execute in Edge
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Administrator\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
	}
	public String getScreenshotPath(String testcaseName,WebDriver driver) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String destinationFile=System.getProperty("user.dir")+"\\reports\\"+testcaseName+".png";
		FileUtils.copyFile(source,new File(destinationFile));
		return destinationFile;
	}

}
