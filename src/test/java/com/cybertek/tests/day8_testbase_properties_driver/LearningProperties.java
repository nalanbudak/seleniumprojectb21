package com.cybertek.tests.day8_testbase_properties_driver;

import org.testng.annotations.Test;

public class LearningProperties {

    @Test
    public void java_properties_reading_test(){

        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));

        //shortcut====>once  System.getProperty("user.name")) once bunu yaz sonra ilk parantezin yanina . koy ve soutv yaz.enter


//=============================================

        /*properties are stored as key and value format

        key=value

        browser=chrome

        username=test

        password=tester

        env=qa1.google.com    */


    }



}
