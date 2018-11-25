package com.appium.webdriver.config;

import java.util.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilityClass {

	public static boolean isElementPresent(WebDriver driver,WebElement element) {
		try {
		 WebDriverWait	wait = new WebDriverWait(driver, 180);
			wait.until(ExpectedConditions.visibilityOf(element));
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}	
	
}
