package com.appium.webdriver.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	Properties props=null;
	FileInputStream inputstream=new FileInputStream("/Appium_Sample/config.properties");
	
	public ReadPropertyFile() throws IOException {
		
		props=new Properties();
		props.load(inputstream);
		
	}
	
	public String getAppPath()
	{
		return props.getProperty("app_path");
	}
	
	public String getPlatformName()
	{
		return props.getProperty("platform_name");
	}
	
	public String getDeviceName()
	{
		return props.getProperty("device_name");
	}
	
	public String getPlatformVersion()
	{
		return props.getProperty("platform_version");
	}
	
	public String getServer()
	{
		return props.getProperty("server");
	}
	
	public String getPort()
	{
		return props.getProperty("port");
	}
}
