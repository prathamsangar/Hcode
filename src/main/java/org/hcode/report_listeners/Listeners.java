package org.hcode.report_listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.hcode.driver.DriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener, ISuiteListener {
	
	@Override
	public void onStart(ISuite suite) {
		ExtentReportsDemo.initReports();
	}
	
	 @Override
	    public void onTestFailure(ITestResult result) {
		 ExtentReportsLogger.fail(result.getMethod().getMethodName() + " Is Failed");
		 
			String fileName = System.getProperty("user.dir")+File.separator+"/src/test/resources/screenshots"+File.separator+result.getMethod().getMethodName();
			File fi = ((TakesScreenshot)DriverManager.getDriver()).getScreenshotAs(OutputType.FILE);
			
			try {
				FileUtils.copyFile(fi, new File(fileName+ ".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	    }
	 
	 
	 @Override
	    public void onTestSkipped(ITestResult result) {
		 ExtentReportsLogger.skip(result.getMethod().getMethodName() + " Is Skipped");
			  }
	
	
	@Override
	public void onFinish(ISuite suite) {
		try {
			ExtentReportsDemo.flushReports();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		ExtentReportsDemo.createTest(result.getMethod().getMethodName());
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		ExtentReportsLogger.pass(result.getMethod().getMethodName() + " Is Passed");
	}


}
