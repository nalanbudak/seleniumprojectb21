package com.cybertek.tests.day9_driver_actions_uploads;

import com.cybertek.utilities.Driver;
import org.testng.annotations.Test;

public class UploadPractice {

    @Test
    public void upload_test(){
        //driver = Driver.getDriver()
        Driver.getDriver().get("http://practice.cybertekschool.com/upload");



    }


}
