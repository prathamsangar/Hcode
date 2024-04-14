package org.hcode.tests;

import org.hcode.dataProviders.WriteFile;
import org.hcode.pages.DynamicElements;
import org.testng.annotations.Test;

public class CarDetailsTests extends BaseTest {
	
	
	 @Test
	    public void printCarDataTest() {
	        // Call the GetCarImg method to retrieve carData
		 DynamicElements carDataA = new DynamicElements();
		 
		 String[][] a = carDataA.GetCarImg();
		 
			
	        
		 for (int i = 0; i < a.length; i++) {
	            System.out.println("Car " + (i + 1) + " data:");	            
	            WriteFile.writeToExcel(i, 0, "Car " + (i + 1) + " data:");	 
	            
	            System.out.println("Car Name: " + a[i][0]);	            
	            WriteFile.writeToExcel(i, 1,  a[i][0]);	
	            
	            System.out.println("Car Kilometers: " + a[i][1]);	            
	            WriteFile.writeToExcel(i, 2,  a[i][1]);	  
	            
	            System.out.println("Car Transmission: " + a[i][2]);	            
	            WriteFile.writeToExcel(i, 3,  a[i][2]);	
	            
	            System.out.println("Car Extra Highlight: " + a[i][3]);	            
	            WriteFile.writeToExcel(i, 4,  a[i][3]);	  
	            
	            System.out.println("Car Rate: " + a[i][4]);
	            WriteFile.writeToExcel(i, 5,  a[i][4]);
	            
	            System.out.println("Car EMI Details: " + a[i][5]);	            
	            WriteFile.writeToExcel(i, 6,  a[i][5]);
	            
	            System.out.println("----------------------------------------------");
	    }
	
}
}
