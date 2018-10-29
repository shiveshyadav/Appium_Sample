package com.appium.webdriver.config;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static com.appium.webdriver.config.Prop.*;
import java.io.IOException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

@SuppressWarnings("unused")
public class SuperTestNGAndroid  {


	public  AndroidDriver<AndroidElement> driver;

	@BeforeSuite
	public void LaunchBrowser() throws Exception
	{

		//Desired Capabilities settings to launch application in Device		
		DesiredCapabilities capabilities = new DesiredCapabilities(); 
		capabilities.setCapability("app", APP_PATH);
		capabilities.setCapability("platformName", PLATFORM_NAME);		
		capabilities.setCapability("deviceName", DEVICE_NAME);	
		capabilities.setCapability("platformVersion", PLATFORM_VERSION);	
		driver = new AndroidDriver <AndroidElement>(new URL("http://"+SERVER+":"+PORT+"/wd/hub"), capabilities) ;	    
		System.out.println("Appium server started");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			return true;
		} catch (Exception e) {
			return false;
		}
	}


	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}
	
	
	public String getResult(String str)
	{
		  String[] result = str.split("=");
		  
		  return result[1].trim();
	}
	

	@AfterSuite
	public void postCondition() throws Exception
	{
		driver.resetApp();
	}

}
