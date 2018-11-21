How to setup appium sample project in eclipse.

prerequisite :

Appium Latest version
Eclipse

Steps to configure test :
Import Appium_Sample Project in Eclipse.
Connect android device to system. (Developer option should be enabled and USB debugging should be ON)
Get android device ID using (adb device command)
Get android device version in about -> Software
Open Prop.java file under "com.appium.webdriver.config" package.
Update the Application path , device ID and platform version
Start Appium server on 127.0.0.1:4723
When Appium server is started run "testng_android.xml" using testng.

Result : 
Test-output folder ->  "emailable-report.html"
