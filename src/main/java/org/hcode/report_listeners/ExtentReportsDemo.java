package org.hcode.report_listeners;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentReportsDemo {
	
	
	private ExtentReportsDemo() {}
	private static ExtentReports extent;
	
	
	public static void initReports() {
		if(Objects.isNull(extent)) {
		extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("index.html");
		extent.attachReporter(spark);
		
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setDocumentTitle("Automation report");
		spark.config().setReportName("Pratham sangar");
		}
		}
		
		
	
	public static void flushReports() throws IOException {	
		if(Objects.nonNull(extent)) {
		extent.flush();
		}
		Desktop.getDesktop().browse(new File("Index.html").toURI());
		
	}
	
	public static void createTest(String testcasename) {
		if(Objects.nonNull(extent)) {
		ExtentManager.setExtentTest(extent.createTest(testcasename));
		}
	}
}















