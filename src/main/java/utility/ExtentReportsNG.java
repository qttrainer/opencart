package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsNG {
	
	
	static ExtentReports extent;
	
	
	public static ExtentReports getReportObjcet()
	{
		
		String path = System.getProperty("user.dir")+ "\\reports\\myReport.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Automation Test Resport");
		reporter.config().setDocumentTitle("Automation Result");
		
		extent= new ExtentReports();
		extent.attachReporter(reporter);
		return extent;
	}

}
