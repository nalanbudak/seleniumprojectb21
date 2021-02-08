package com.cybertek.tests.day10_pom_synchronization_jsExecutor;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class JSExecutorPractices {

    @Test
    public void scroll_using_jsexecutor_test1(){

        //Get the page
        Driver.getDriver().get("http://practice.cybertekschool.com/infinite_scroll");

        //Create instance of JSExecutor and cast our driver type to it
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //Use "js" to reach JavascriptExecutor methods
        js.executeScript("window.scrollBy(0, 750)");


    }

}
