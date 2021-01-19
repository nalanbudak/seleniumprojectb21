package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class AlertPractices {

    @BeforeMethod
    public void setUpMethod(){
        //1. Open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. Go to website: http://practice.cybertekschool.com/javascript_alerts
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    //TC #1: Information alert practice

    //3. Click to "Click for JS Alert" button
    //4. Click to OK button from the alert
    //5. Verify "You successfuly clicked an alert" text is displayed.


}
