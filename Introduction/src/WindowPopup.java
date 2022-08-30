import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Windows authentication pop up
   
        //Syntax: driver.get("https://username:password@URL");
        driver.get("https://admin:admin@the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Basic Auth")).click();
	}

}
