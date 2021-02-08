package com.cybertek.tests.day10_pom_synchronization_jsExecutor;

import com.cybertek.utilities.Driver;
import org.testng.annotations.Test;

public class JSExecutorPractices {

    @Test
    public void scroll_using_jsexecutor_test1(){

        //Get the page
        Driver.getDriver().get("http://practice.cybertekschool.com/infinite_scroll");



    }

}
