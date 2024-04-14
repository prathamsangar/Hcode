package org.hcode.tests;

import java.io.IOException;

import org.hcode.driver.Driver;
import org.hcode.pages.WebTables;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTablesTests {

	@BeforeMethod
	public void setUp() throws IOException {
		Driver.initDriver("webTables");
	}

	@AfterMethod
	public void tearDown() {
		Driver.quitDriver();
	}

	@Test
	public void findName() {
		Assert.assertTrue(new WebTables().findCarouselItems().contains("Shri Prashant Kumar"), "Shri Prashant Kumar is not present in the list.");
		Assert.assertTrue(new WebTables().findCarouselItems().contains("Shri Nitin Joshi"), "Shri Nitin Joshi is not present in the list.");
		Assert.assertTrue(new WebTables().findCarouselItems().contains("Shri S S Chauhan, IRSME"), "Shri S S Chauhan is not present in the list.");
		
	}
}




