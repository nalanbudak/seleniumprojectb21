package com.cybertek.tests.day2_locators_getText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleSearchVerification {

    public static void main(String[] args) {

        //TC #4: Google search
        //1- Open a chrome browser
        //setup driver
        WebDriverManager.chromedriver().setup();
        //open browser
        WebDriver driver = new ChromeDriver();

        //maximize the page
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.get("https://www.google.com");

        //3- Write “apple” in search box
        //4- Click google search button
        //5- Verify title:
        //Expected: Title should start with “apple” word


    }
}
