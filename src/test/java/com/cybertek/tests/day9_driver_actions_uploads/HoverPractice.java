package com.cybertek.tests.day9_driver_actions_uploads;

import com.cybertek.utilities.Driver;
import org.testng.annotations.Test;

public class HoverPractice {

    @Test
    public void hover_test(){
        //1. Go to http://practice.cybertekschool.com/hovers
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");

        //2. Hover over to first image
        //3. Assert:
        //a. “name: user1” is displayed
        //4. Hover over to second image
        //5. Assert:
        //a. “name: user2” is displayed
        //6. Hover over to third image
        //7. Confirm:
        //a. “name: user3” is displayed
    }

}
