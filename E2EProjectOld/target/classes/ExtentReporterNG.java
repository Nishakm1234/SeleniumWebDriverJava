package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	static ExtentReports extent;
	public static ExtentReports getReportObject() {
		//ExtentReports, ExtentSparkReporter
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		//ExtentSparkReporter expects the path where the HTML report file should be generated.
		//All the configurations can be done using ExtentSparkReporter object.
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		//ExtentReports extent=new ExtentReports();
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Nisha K M");
		return extent;
	}

}
