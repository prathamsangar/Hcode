package org.hcode.tests;

import org.hcode.pages.CommonWebElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CommonWebElementsTests extends BaseTest {

	

	@Test
	public void commonTest() {

		CommonWebElements cmm = new CommonWebElements();

		String[] a = cmm.hoverOnMenu().getPopMakes();
		String[] b = cmm.getPopModels();
		boolean found = false;

		for (String text : a) {
			if (text.equals("Toyota")) {
				found = true;
				break;
			}
		}

		Assert.assertTrue(found, "Toyota not found in the array");
		for (String textOfModels : b) {
			System.out.println(textOfModels);
		}
	}
	
	@Test
	public void clickHatchBack() {
		new CommonWebElements().hoverOnMenu().clickElement("Hatchback");	
	}

}
