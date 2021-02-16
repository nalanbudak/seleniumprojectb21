package com.cybertek.tests.day8_testbase_properties_driver;

import com.cybertek.tests.base.TestBase;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.WebOrderUtils;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class WebTablePractices extends TestBase {  //setup'i  test base class'tan aldik extends keyword'u kullanarak


    @Test
    public void verify_order_test() throws InterruptedException, IOException {
        //#1- Create Properties class object
        Properties properties = new Properties();

        //#2- Open the file in JVM Memory and pass the path of the file
        String path = "configuration.properties";
        //For windows > copy path > copy path from content root

        FileInputStream file = new FileInputStream(path);

        //#3- Load the opened file into the Properties object.

        properties.load(file);

        String url = properties.getProperty("webOrderUrl");

        driver.get(url);

        WebOrderUtils.loginToSmartBear(driver);

        //This is re-usable method we created in BrowserUtil class to replace Thread.sleep
        BrowserUtils.sleep(1);

        //Verify "Mark Smith" is in the list
        WebOrderUtils.verifyOrder(driver, "Mark Smith");
    }


}
