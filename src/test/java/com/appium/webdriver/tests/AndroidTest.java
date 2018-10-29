package com.appium.webdriver.tests;

import org.testng.annotations.Test;
import com.appium.webdriver.HomePage;
import com.appium.webdriver.config.SuperTestNGAndroid;
import junit.framework.Assert;

public class AndroidTest extends SuperTestNGAndroid {

    @Test
    public void VerifyAddition() throws Exception {
     
    	HomePage home= new HomePage(driver);
    	home.entervaluesInLeftAndRightTextBox("2","5");
    	home.clickonAddition();
    	String result = home.getResulText();
    	Assert.assertEquals("7.00",getResult(result));
    	
    }
    
    
    @Test
    public void VerifyMultiplication() throws Exception {
     
    	HomePage home= new HomePage(driver);
    	home.entervaluesInLeftAndRightTextBox("2","5");
    	home.clickonMultiplication();
    	String result = home.getResulText();
   	Assert.assertEquals("10.00",getResult(result));
    }
    
    @Test
    public void VerifySubtraction() throws Exception {
     
    	HomePage home= new HomePage(driver);
    	home.entervaluesInLeftAndRightTextBox("5","20");
    	home.clickonSubtraction();
    	String result = home.getResulText();
    	Assert.assertEquals("-15.00",getResult(result));
    }
}