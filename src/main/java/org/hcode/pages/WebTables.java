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
            // Extract the text from the parent element and add it to the list
            String text = parentElement.getText();
            System.out.println(text);
            textList.add(text);
        }
		
	return textList;
	
	}

}
