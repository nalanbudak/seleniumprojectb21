package com.cybertek.tests.day3_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P4_Xpath_Practice {

    public static void main(String[] args) throws InterruptedException{

        //go to this link: http://practice.cybertekschool.com/multiple_buttons

        WebDriver driver = WebDriverFactory.getDriver("chrome");        // WebdriverFactory "i utilies' den cagirdik
        driver.manage().window().maximize();    // pencere buyutuyor


        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //locate button2 USING XPATH LOCATOR

        WebElement button2 = driver.findElement(By.xpath("//button[.='Button 2']"));

        Thread.sleep(2000);
        button2.click();



    }

}
/*- RELATIVE XPATH:
-           Relative xpath starts with  double slash "//"

           "//" —→ means you can start from anywhere in the code.

            -Because we have the option to start anywhere we want to start from, RELATIVE XPATH is very dependable.

           - You will only have problem with this only if the attribute value you used in the locator is changing.

             //a --> this means jump to first link (a) you find in the HTML CODE




 */