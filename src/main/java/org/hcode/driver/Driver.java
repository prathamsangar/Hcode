package org.hcode.driver;

import java.io.IOException;
import org.hcode.constants.FrameworkConstants;
import org.hcode.utils.ReadPropertyFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	
	private static WebDriver driver;
	
	
	public static void initDriver(String url) throws IOException {
		
		if(driver==null) {
		System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromedriverpath());
		driver = new ChromeDriver();
		DriverManager.setDriver(driver);
		DriverManager.getDriver().manage().window().maximize();
		DriverManager.getDriver().get(ReadPropertyFile.getValue(url));
		
		}
	
	}
	
	public static void quitDriver() {
		if(DriverManager.getDriver()!=null) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
			driver = null;
		}
	}

}
