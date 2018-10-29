Mobile Appium Tests
===================

### What do I need?

Appium Latest version
Eclipse

### How do I get a device ID?
adb devices

## Android

Assuming you have downloaded the Android SDK, type ```adb devices``` in your console

## How to configure the test
Import Appium_Sample Project in Eclipse.
Connect android device to system. (Developer option should be enabled and USB debugging should be ON)
Get android device ID using (adb device command)
Get android device version in about -> Software
Open Prop.java file under "com.appium.webdriver.config" package.
Update the Application path , device ID and platform version
Start Appium server on 127.0.0.1:4723
When Appium server is started run "testng_android.xml" using testng.

##Result
Test-output folder ->  "emailable-report.html"
