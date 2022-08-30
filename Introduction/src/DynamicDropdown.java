import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//a[@value='MAA'] -> Chennai
		//a[@value='BLR'] -> Bangalore
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//From dropdown no need of index values
		//driver.findElement(By.xpath("//a[@value='BLR']")).click();
		//Thread.sleep(2000);
		//To dropdown requires index values because those values are present in From dropdown as well as To dropdown
		//(Ex: Chennai is present in both dropdowns) -> (//a[@value='MAA'])[2]
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		//  //div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
		Thread.sleep(2000);
		//  //div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
	}

}
