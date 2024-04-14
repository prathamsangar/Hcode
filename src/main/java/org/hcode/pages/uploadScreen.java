package org.hcode.pages;

import org.hcode.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class uploadScreen {

	private final By fileInput = By.id("file-upload");
	private final By submitUpload = By.id("file-submit");


	public WebElement chooseFile() {
		WebElement file = DriverManager.getDriver().findElement(fileInput);
		return file;
	}

	public uploadScreen submitUploadFile() {
		DriverManager.getDriver().findElement(submitUpload).click();
		return this;

	}

}
