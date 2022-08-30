package test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoProgram2 {
	@BeforeTest
	public void Prerequesite() {
		//Selenium
			System.out.println("I will execute it first");
	}
	@Parameters({"URL"})
	@Test
	public void PersonalLoan(String urlname) {
		//Selenium
			System.out.println("PersonalLoan");
			System.out.println(urlname);
	}
		
	
}
