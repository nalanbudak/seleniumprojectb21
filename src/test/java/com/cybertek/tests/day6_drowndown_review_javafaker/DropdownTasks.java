package com.cybertek.tests.day6_drowndown_review_javafaker;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownTasks {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");

        //2. Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");

        //maximize
        driver.manage().window().maximize();

        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @Test
    public void test2_verify_state_dropdown(){

    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {

        //additional 5 seconds before closing the browser
        Thread.sleep(5000);

        driver.close();

    }

}
