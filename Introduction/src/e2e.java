import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//To select one-way radio button
		driver.findElement(By.name("ctl00$mainContent$rbtnl_Trip")).click();
		
		//From Delhi to Chennai
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='DEL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
	
		//To get the current date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
		
		//To check if return date is disabled
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
		//To select checkbox
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscoun']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscoun']")).isSelected());
		
		//To add and check number of passengers(UpdatedDropdown)
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		for(int i=1;i<5;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		//To select Currency(Static Dropdown)
		WebElement staticDropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown=new Select(staticDropdown);
		dropdown.selectByIndex(3);//Based on index value
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		//Search Button
		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
	}

}
