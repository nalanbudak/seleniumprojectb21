package com.cybertek.tests.day4_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class P0_FindElements_Practice1 {

    public static void main(String[] args) {

        //#1- Open chrome browser and
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // go to: http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().maximize();

        //#2- Locate all of the LINKS on the page, and print out all the texts
        //#3- Print out how many links on the page


    }
}
