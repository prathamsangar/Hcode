package org.hcode.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
	
//	Added a public method to read config file data, so it can be called from anywhere
	
	public static String getValue(String key) throws IOException{
		Properties property = new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/Config/config.properties");
		property.load(file);
		return property.getProperty(key);
		
	}

}
