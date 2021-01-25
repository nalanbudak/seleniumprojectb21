package com.cybertek.tests.day8_testbase_properties_driver;

import com.cybertek.utilities.WebDriverFactory;
import com.cybertek.utilities.WebOrderUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WebTablePractices {

    @Test
    public void verify_order_test() throws InterruptedException {
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete12%2fWebOrders%2fDefault.aspx");

        WebOrderUtils.loginToSmartBear(driver);

        Thread.sleep(1000);

        //Verify "Mark Smith" is in the list
        WebOrderUtils.verifyOrder(driver, "Mark Smith");
    }


}
