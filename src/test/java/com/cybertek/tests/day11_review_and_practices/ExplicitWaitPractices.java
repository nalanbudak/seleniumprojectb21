package com.cybertek.tests.day11_review_and_practices;

import com.cybertek.utilities.Driver;
import org.testng.annotations.Test;

public class ExplicitWaitPractices {


    @Test
    public void dynamic_load_page1(){
        //TC#41 : Dynamically Loaded Page Elements 1
        //1. Go to http://practice.cybertekschool.com/dynamic_loading/1
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/1");
        //2. Click to start
        //3. Wait until loading bar disappears
        //4. Assert username inputbox is displayed
        //5. Enter username: tomsmith
        //6. Enter password: incorrectpassword
        //7. Click to Submit button
        //8. Assert “Your password is invalid!” text is displayed.
        //Note: Follow POM Design Pattern
    }

}
