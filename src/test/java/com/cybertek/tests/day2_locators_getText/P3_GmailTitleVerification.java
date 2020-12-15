package com.cybertek.tests.day2_locators_getText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_GmailTitleVerification {
    public static void main(String[] args) {
        //TC #3: Back and forth navigation
        //1- Open a chrome browser
        //setup
        WebDriverManager.chromedriver().setup();
        //open browser
        WebDriver driver = new ChromeDriver();

        //2- Go to: https://google.com
        driver.get("https://www.google.com");

        //3- Click to Gmail from top right.
        //4- Verify title contains:
        //Expected: Gmail
        //5- Go back to Google by using the .back();
        //6- Verify title equals:
        //Expected: Google
    }
}
