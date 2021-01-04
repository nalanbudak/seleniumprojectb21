package com.cybertek.tests.day4_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class P3_Checkbox_Practices {

    public static void main(String[] args) {
        //Practice: Cybertek Checkboxes
        //1. Go to http://practice.cybertekschool.com/checkboxes
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/checkboxes");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //LOCATING CHECKBOXES
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));

        // another option as locator for checkboxes: //form[@id='checkboxes']/input[1]
        // another option as locator for checkboxes: //form[@id='checkboxes']/input[2]

        //2. Confirm checkbox #1 is NOT selected by default
        if(!checkbox1.isSelected()){
            System.out.println("Checkbox#1 is NOT selected. Default value verification PASSED! ");
        }else{
            System.out.println("Checkbox#1 is selected. Default value verification FAILED!!!");
        }

        //3. Confirm checkbox #2 is SELECTED by default.


        //4. Click checkbox #1 to select it.
        //5. Click checkbox #2 to deselect it.
        //6. Confirm checkbox #1 is SELECTED.
        //7. Confirm checkbox #2 is NOT selected.
    }
}
