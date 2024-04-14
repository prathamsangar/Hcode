package org.hcode.pages;

import java.util.List;

import org.hcode.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CommonWebElements {

	private final By buyCarDropdown = By.xpath("//div/div[2]/ul/li[1]/a");
	private final By popular_makes = By.xpath("//li/div/div/ul[1]");
	private final By popular_models = By.xpath("//li/div/div[2]/ul");
	private final By allLists = By.xpath("//div/ul/li/div/div/ul");
	
	
	public CommonWebElements hoverOnMenu() {
	WebElement topNavbarElement = DriverManager.getDriver().findElement(buyCarDropdown);
    Actions actions = new Actions(DriverManager.getDriver());
    actions.moveToElement(topNavbarElement).perform();
    return this;
    
	}
	
	public String[] getPopMakes() {
		
		 WebElement ulElement = DriverManager.getDriver().findElement(popular_makes);
		
		  List<WebElement> liElements = ulElement.findElements(By.tagName("li"));
		  String[] listTexts = new String[liElements.size()];
	        
	        // Loop through each <li> element and store its text in the array
	        for (int i = 0; i < liElements.size(); i++) {
	            listTexts[i] = liElements.get(i).getText();
	        }
		
		return listTexts;
		
	}
	
public String[] getPopModels() {
	 WebElement ulElementOfModels = DriverManager.getDriver().findElement(popular_models);
	 
	  List<WebElement> liElementsOfModels = ulElementOfModels.findElements(By.tagName("li"));
	  String[] listTextsOfModels = new String[liElementsOfModels.size()];
        
        // Loop through each <li> element and store its text in the array
        for (int i = 0; i < liElementsOfModels.size(); i++) {
        	listTextsOfModels[i] = liElementsOfModels.get(i).getText();
        }
	
	return listTextsOfModels;
		
	}
	
	public void clickElement(String ElementName) {
		
		WebElement allELementsList = DriverManager.getDriver().findElement(allLists);
		
		List<WebElement> allLiElements = allELementsList.findElements(By.tagName("li"));
		
		String[] listOfAllTexts = new String[allLiElements.size()];
		for (int i = 0; i < listOfAllTexts.length; i++)
		{
			listOfAllTexts[i] = allLiElements.get(i).getText();
			
			if (listOfAllTexts[i].equals(ElementName)) {
				allLiElements.get(i).click();
		}
		
	}
	
}}
	








