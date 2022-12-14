package testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import utility.Base;
import utility.ExtentReportsNG;

public class Listeners extends Base implements ITestListener {
	ExtentTest test;
	ExtentReports extent = ExtentReportsNG.getReportObjcet();
	ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();
	 public void onTestStart(ITestResult result) {
		test =  extent.createTest(result.getMethod().getMethodName());
		extentTest.set(test);
		    //on test start
		  }
	 
	 public void onTestSuccess(ITestResult result) {
		    // not implemented
		 extentTest.get().log(Status.PASS, "Test pass");

		  }
	 
	public  void onTestFailure(ITestResult result) {
		
		extentTest.get().log(Status.FAIL,"Test Fail");
		String methodName = result.getMethod().getMethodName();
		File source = takeScreenshot.getScreenshotAs(OutputType.FILE);
		File distination = new File(System.getProperty("User.dir")+"\\screenshoot\\"+methodName+ ".png");
		try {
			FileUtils.copyFile(source, distination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		    // not implemented
		  }
	
	public  void onFinish(ITestContext context) {
	    // not implemented
		extent.flush();
	  }

}
