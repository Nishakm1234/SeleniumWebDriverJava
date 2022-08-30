package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener is an interface which implements TestNG Listeners
public class Listeners implements ITestListener{
	@Override
	public void onTestSuccess(ITestResult result) {
		//System.out.println("I successfully executed Listeners Pass code");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("I failed executed Listeners Pass code"+result.getName());
	}
}
