package qaclickacademy.ExtentReports;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExtentReportDemo {
	ExtentReports extent;
	@BeforeTest
	public void config() {
		//ExtentReports, ExtentSparkReporter
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		//ExtentSparkReporter expects the path where the HTML report file should be generated.
		//All the configurations can be done using ExtentSparkReporter object.
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		//ExtentReports extent=new ExtentReports();
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Nisha K M");
	}
@Test
public void initialDemo() {
	ExtentTest test=extent.createTest("Initial Demo");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com");
	System.out.println(driver.getTitle());
	driver.close();
	test.fail("Results do not match");//To fail the test externally in the ExtentReport
	extent.flush();
}
}
