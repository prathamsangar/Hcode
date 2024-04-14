package org.hcode.pages;

import java.io.IOException;

import org.hcode.dataProviders.Dataproviders;
import org.hcode.driver.DriverManager;
import org.hcode.utils.ReadPropertyFile;
import org.openqa.selenium.By;

public class Dashboard {
	
	
	private final By fileUploadScreen = By.linkText("File Upload");
	
	
	public uploadScreen clickUploadScreen() throws IOException {
		
		DriverManager.getDriver().findElement(fileUploadScreen).click();
		Dataproviders.setSheetName(ReadPropertyFile.getValue("UploadFileSheetName"));
		
		return new uploadScreen();
	}
	
}
