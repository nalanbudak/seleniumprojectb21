package com.cybertek.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WT_CybertekLinkVerification {

    public static void main(String[] args) {

        //TC #3: PracticeCybertek/ForgotPassword URL verification
        //1. Open Chrome browser
        //setup
        WebDriverManager.chromedriver().setup();

        //create instance of browser
        WebDriver driver = new ChromeDriver();

        //2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //3. Enter any email into input box
        driver.findElement(By.name("email")).sendKeys("anything@anydomain.com");

        //4. Click on Retrieve password
        driver.findElement(By.id("form_submit")).click();

        //5. Verify URL contains:
        //Expected: “email_sent”
        //6. Verify textbox displayed the content as expected.
        //Expected: “Your e-mail’s been sent!”



    }

}
