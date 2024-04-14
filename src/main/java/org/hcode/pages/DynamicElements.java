package org.hcode.pages;

import java.util.List;

import org.hcode.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DynamicElements {
	
	
	
	  private final By carElements = By.xpath("//div/div[5]/div/div/a");
	  private final By carNameElement = By.xpath(".//div/div[2]/h3");
	  private final By carKilometersElement = By.xpath(".//div/div[2]/ul/li[1]");
	  private final By carTransmissionElement = By.xpath(".//div/div[2]/ul/li[5]");
	  private final By carExtraHighlightElement = By.xpath(".//div/div[2]/span");
	  private final By carEMIDetailsElement = By.xpath(".//div/div[2]/div[2]/span");
	  private final By carRateElement = By.xpath(".//div/div[2]/div[1]/strong");
	  

	
	  
	  public String[][] GetCarImg() {
		    List<WebElement> carsElemento = DriverManager.getDriver().findElements(carElements);
		    
		    // Arrays to store the text values
		    String[][] carData = new String[carsElemento.size()][6]; // 6 columns for each attribute
		    
		    for (int i = 1; i <= carsElemento.size(); i++) {
		        WebElement carElement = DriverManager.getDriver().findElement(By.xpath("(//div/div[5]/div/div/a)[" + i + "]"));
		        
		        WebElement carNameElemen = carElement.findElement(carNameElement);
		        WebElement carKilometersElemen = carElement.findElement(carKilometersElement);
		        WebElement carTransmissionElemen = carElement.findElement(carTransmissionElement);
		        WebElement carExtraHighlightElemen = carElement.findElement(carExtraHighlightElement);
		        WebElement carRateElemen = carElement.findElement(carRateElement);
		        WebElement carEMIDetailsElemen = carElement.findElement(carEMIDetailsElement);

		        // Get text from elements and store in arrays
		        carData[i - 1][0] = carNameElemen.getText();
		        carData[i - 1][1] = carKilometersElemen.getText();
		        carData[i - 1][2] = carTransmissionElemen.getText();
		        carData[i - 1][3] = carExtraHighlightElemen.getText();
		        carData[i - 1][4] = carRateElemen.getText();
		        carData[i - 1][5] = carEMIDetailsElemen.getText();
		    }
		    
		    return carData;
		}
}



