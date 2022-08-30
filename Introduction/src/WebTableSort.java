import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableSort {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//Click on column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		//Capture all webelements into a list
		List<WebElement> elementList=driver.findElements(By.xpath("//tr/td[1]"));
		
		//Capture text on all webelements into new(original) list
		List<String> originalList=elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//Sort on the original list of step3 -> sorted list
		List<String> sortedList=originalList.stream().sorted().collect(Collectors.toList());
		
		//compare original list v/s sorted list
		Assert.assertTrue(originalList.equals(sortedList));
		
		//Scan the name column with getText()-> Beans ->Print the price of the Beans
		//List<String>price=elementList.stream().filter(s->s.getText().contains("Beans")).map(s->getPriceVegies(s)).collect(Collectors.toList());
		//price.forEach(a->System.out.println(a));
		
		//Concept of Pagination
		//Scan the name column with getText()-> Rice ->Print the price of the Rice
		List<String>price;
		do {
			List<WebElement> rows=driver.findElements(By.xpath("//tr/td[1]"));
			price=rows.stream().filter(s->s.getText().contains("Rice")).map(s->getPriceVegies(s)).collect(Collectors.toList());	
			price.forEach(a->System.out.println(a));
			if(price.size()<1) {
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
			
		}
		while(price.size()<1);
		
	}

	private static String getPriceVegies(WebElement s) {
		String priceValue=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

}
