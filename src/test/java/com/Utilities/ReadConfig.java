package com.Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties properties;
	
	String path = "C:\\Users\\Badal\\Workspace\\POM_Framework\\Configuration\\config.properties";

	public ReadConfig() {
		try {
		properties = new Properties();
		
		FileInputStream fis = new FileInputStream(path);
		properties.load(fis);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getBaseUrl() {
	 String value =	properties.getProperty("baseUrl");
	 
	 if (value!=null)
		 return value;
	 else
		 throw new RuntimeException("URL is not specified in config file.");
	}
	
	public String getBrowser() {
		 String value =	properties.getProperty("browser");
		 
		 if (value!=null)
			 return value;
		 else
			 throw new RuntimeException("browser is not specified in config file.");
		}
}
