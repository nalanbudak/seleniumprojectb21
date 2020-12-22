package com.cybertek.tests.day3_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class P4_Xpath_Practice {

    public static void main(String[] args) {

        //go to this link: http://practice.cybertekschool.com/multiple_buttons

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //locate button2 USING XPATH LOCATOR




    }

}
