package org.hcode.tests;

import java.io.IOException;

import org.hcode.driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	protected BaseTest() {}



	@BeforeMethod
	public void setUp() throws IOException {
		Driver.initDriver("dynamicElements");
	}

	@AfterMethod
	public void tearDown() {
		Driver.quitDriver();
	}


}
