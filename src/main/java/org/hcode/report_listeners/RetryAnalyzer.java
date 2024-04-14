package org.hcode.report_listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	int count = 0;
	int retry_count = 1;
	@Override
	public boolean retry(ITestResult result) {
		while(count<retry_count) {
			
			count++;
			return true;
		}
		return false;
	}

}
