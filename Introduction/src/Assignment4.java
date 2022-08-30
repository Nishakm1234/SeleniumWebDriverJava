import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		System.out.println(driver.findElements(By.tagName("frame")).size());
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src='/frame_middle']")));
		//frame_top
		//driver.findElement(By.cssSelector("frame[src=''/frame_middle']")).click();
		System.out.println(driver.findElement(By.id("content")).getText());
	}

}
