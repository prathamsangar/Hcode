package org.hcode.tests;

import java.io.IOException;

import org.hcode.dataProviders.Dataproviders;
import org.hcode.driver.Driver;
import org.hcode.pages.Dashboard;
import org.hcode.pages.uploadScreen;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UploadTestCases extends BaseTest {
	
private UploadTestCases() {}

@BeforeMethod
public void setUp() throws IOException {
	Driver.initDriver("uploadFile");
}

@AfterMethod
public void tearDown() {
	Driver.quitDriver();
}


@Test(priority = 1)
public void clickUploadExists() throws IOException {
	
	new Dashboard().clickUploadScreen();
}

	
@Test(priority = 2, dataProvider = "filePaths", dataProviderClass = Dataproviders.class, dependsOnMethods = "clickUploadExists", groups = { "sanity" })
public void testFileUpload(String filePath) throws IOException {  

   new Dashboard().clickUploadScreen().chooseFile().sendKeys(filePath);
   new uploadScreen().submitUploadFile();
}

    
}
        
