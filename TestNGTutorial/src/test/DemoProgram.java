package test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DemoProgram {
@AfterTest
public void lastExecution() {
	System.out.println("It is executed at the end");
}
	
@Test(groups={"Smoke"})
public void demo() {
	System.out.println("Hello");
}

@Test
public void secondClass() {
	System.out.println("Bye");
	Assert.assertTrue(false);
}
@AfterSuite
public void AfSuite() {
		System.out.println("I am Last No.1");
	}
}
