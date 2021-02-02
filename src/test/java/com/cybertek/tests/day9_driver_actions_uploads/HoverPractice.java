package com.cybertek.tests.day9_driver_actions_uploads;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HoverPractice {

    @Test
    public void hover_test(){
        //1. Go to http://practice.cybertekschool.com/hovers
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");

        //locating all the web elements needed

        //locating all the images from the page
        WebElement img1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement img2 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement img3 = Driver.getDriver().findElement(By.xpath("(//img)[3]"));

        //locating all the "user" texts from the page for "isDisplayed" verification
        WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        WebElement user2 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));
        WebElement user3 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));


        //2. Hover over to first image
        //3. Assert:
        //a. “name: user1” is displayed
        //4. Hover over to second image
        //5. Assert:
        //a. “name: user2” is displayed
        //6. Hover over to third image
        //7. Confirm:
        //a. “name: user3” is displayed
    }

}
