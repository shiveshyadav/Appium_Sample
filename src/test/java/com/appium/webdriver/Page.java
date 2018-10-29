package com.appium.webdriver;

import org.openqa.selenium.WebElement;
import com.appium.webdriver.config.UtilityClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public abstract class Page {

	protected AndroidDriver<AndroidElement> driver;

	public Page(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}
	
	public void enterValue(WebElement element, String value)
	{
		if(UtilityClass.isElementPresent(driver, element))
		{
		element.click();
		element.clear();
		element.sendKeys(value);
		}
	}
	
	public void clickonElement(WebElement element)
	{
		if(UtilityClass.isElementPresent(driver, element))
		{
		element.click();
		}
	}
	
	public String getText(WebElement element)
	{
		return element.getText();
	}

}
