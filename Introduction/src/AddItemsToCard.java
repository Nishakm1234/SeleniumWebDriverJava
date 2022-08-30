import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddItemsToCard {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot","Carrot"};
		int j=0;
		List <WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));//Cucumber
		
		for(int i=0;i<products.size();i++) {
			//String name =products.get(i).getText();
			//Format it to get actual vegetable name (Because it will be like Cucumber - 1 Kg)
			String[] name =products.get(i).getText().split("-");//name[0]="Cucumber " and name[1]=" 1 Kg"
			String formattedName=name[0].trim(); //trim will remove the extra space present
			
			//Check whether the name you extracted is present in the array
			//Convert array into arrayList for easy search
			//we are creating array first because it requires less memory
			List itemsNeededList=Arrays.asList(itemsNeeded);
			
			if(itemsNeededList.contains(formattedName)) {
				j++;
				//Click on Add to Cart
				// Should not use text in xPath if the text is not static //button[text()='ADD TO CART']->  because ADD TO CART changes to ADDED
				//driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==itemsNeeded.length){//After elements in List are added then add break
					break;
				}
				
			}
		}
		

	}

}
