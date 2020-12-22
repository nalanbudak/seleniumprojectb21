package com.cybertek.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_ZerobankVerification {

    public static void main(String[] args) {

        //TC #2: Zero Bank link text verification
        //1. Open Chrome browser
        ///setup
        WebDriverManager.chromedriver().setup();

        //open browser and create driver instance
        WebDriver driver = new ChromeDriver();

        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        //3. Verify link text from top left:
        //Expected: “Zero Bank”
        //4. Verify link href attribute value contains:
        //Expected: “index.html”

    }
}
