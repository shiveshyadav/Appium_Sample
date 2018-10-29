package com.appium.webdriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class HomePage extends Page {
	WebDriverWait wait;
	public HomePage(AndroidDriver<AndroidElement> driver) {
		super(driver);		
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(driver, this);
	}

	//DashboardBtn
		@FindBy(id="inputFieldLeft")
		private WebElement xpath_inputFieldLeft; 

		@FindBy(id="inputFieldRight")
		private WebElement xpath_inputFieldRight;
		
		@FindBy(id="additionButton")
		private WebElement xpath_additionButton;
		
		@FindBy(id="subtractButton")
		private WebElement xpath_subtractButton;
		
		@FindBy(id="multiplicationButton")
		private WebElement xpath_multiplicationButton;
		
		@FindBy(id="divisionButton")
		private WebElement xpath_divisionButton;
		
		@FindBy(id="resetButton")
		private WebElement xpath_resetButton;
		
		@FindBy(id="resultTextView")
		private WebElement xpath_resultTextView;
		
		
		public void entervaluesInLeftAndRightTextBox(String first, String second) throws Exception {
			
			enterValue(xpath_inputFieldLeft, first);

			enterValue(xpath_inputFieldRight,second);	
			
			driver.hideKeyboard();
			
		}
		
        public void clickonAddition()
        {
        	clickonElement(xpath_additionButton);
        }
        
        public void clickonMultiplication()
        {
        	clickonElement(xpath_multiplicationButton);
        }
        
        public void clickonDivision()
        {
        	clickonElement(xpath_divisionButton);
        }
        
        public void clickonSubtraction()
        {
        	clickonElement(xpath_subtractButton);
        }
        
        public void clickonResetButton()
        {
        	clickonElement(xpath_resetButton);
        }
        
        public String getResulText()
        {
        	return getText(xpath_resultTextView);
        }
        
        
		

}
