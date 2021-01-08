package com.cybertek.tests.day5_testNG_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TC2_Checkbox_Verification {

    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        //maximize our browser
        driver.manage().window().maximize();

        //creating implicit wait for our findElement method
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //3. Verify “Success – Check box is checked” message is NOT displayed.

        //Option #1: Using xpath and id attribute value to locate successMessage
        WebElement successMessage = driver.findElement(By.xpath("//div[@id='txtAge']"));
        //Option #2: Using xpath and style attribute value: //div[@style='display: block;']
        //Option #3: Using xpath and text value: //div[.='Success - Check box is checked']
        //Option #3: Using xpath and text value: //div[text()='Success - Check box is checked']



        //4. Click to checkbox under “Single Checkbox Demo” section
        //5. Verify “Success – Check box is checked” message is displayed.
    }
}
