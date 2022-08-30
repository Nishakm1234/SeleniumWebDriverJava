import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment5 {
public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

   

        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
        String optionSelected=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();

        WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
        Select s=new Select(dropdown);
        s.selectByVisibleText(optionSelected);

        driver.findElement(By.id("name")).sendKeys(optionSelected);
        driver.findElement(By.id("alertbtn")).click();

        String name =  driver.switchTo().alert().getText();

        if(name.contains(optionSelected)){

        	System.out.println("Alert message success");

        }

        else

        	System.out.println("Something wrong with execution");

	}
}