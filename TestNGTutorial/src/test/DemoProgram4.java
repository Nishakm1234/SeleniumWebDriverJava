package test;

import org.testng.annotations.Test;

public class DemoProgram4 {

		@Test
	public void WebLogInHomeLoan() {
		//Selenium
			System.out.println("webloginhome");
	}
		
		@Test(groups={"Smoke"})
	public void MobileLogInHomeLoan() {
		//Apium
			System.out.println("mobileloginhome");
	}
		
		@Test
	public void APILogInHomeLoan() {
		//Rest API Automation
			System.out.println("APIloginhome");
	}
}
