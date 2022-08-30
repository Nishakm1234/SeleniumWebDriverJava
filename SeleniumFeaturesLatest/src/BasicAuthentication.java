import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v103.network.Network;
import org.openqa.selenium.devtools.v103.network.model.ConnectionType;

import com.google.common.base.Optional;
import java.net.URI;
import java.util.function.Predicate;
public class BasicAuthentication {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//Use ChromeDriver instead of WebDriver
		ChromeDriver driver=new ChromeDriver();
		
		//predicate
		Predicate<URI> uriPredicate=uri -> uri.getHost().contains("httpbin.org");
		((HasAuthentication)driver).register(uriPredicate,UsernameAndPassword.of("foo", "bar'"));
		driver.get("http://httpbin.org/basic-auth/foo/bar");
	}

}
