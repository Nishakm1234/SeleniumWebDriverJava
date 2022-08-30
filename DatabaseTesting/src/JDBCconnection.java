import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JDBCconnection {

	public static void main(String[] args) throws SQLException {
		String host="localhost";
		String port="3306";
		Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/DemoDatabase", "root", "Nisha123!");
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from EmployeeInfo where location='Canada'");
		while(rs.next()) {
		System.out.println(rs.getInt("age"));
		System.out.println(rs.getString("name"));
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys(rs.getString("name"));
		}
	}

}
