package org.hcode.report_listeners;

public class ExtentReportsLogger {
	
private ExtentReportsLogger() {}
	
	public static void pass(String message) {
		ExtentManager.getExtentTest().pass(message);
	}
	
public static void fail(String message) {
	ExtentManager.getExtentTest().fail(message);
	}

public static void skip(String message) {
	ExtentManager.getExtentTest().skip(message);
}

}
