package org.hcode.pages;

import java.util.ArrayList;
import java.util.List;

import org.hcode.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTables {
	
	private final By officerNames = By.xpath("//table/tbody/tr/td[1]");
	
	
	public List<String> findCarouselItems() {
		List<WebElement> namesElementsList =  DriverManager.getDriver().findElements(officerNames);
		
		List<String> textList = new ArrayList<>();
		for (WebElement parentElement : namesElementsList) {
            String text = parentElement.getText();
            textList.add(text);
        }
		
	return textList;
	
	}

}
