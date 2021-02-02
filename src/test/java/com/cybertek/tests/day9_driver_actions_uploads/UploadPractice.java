package com.cybertek.tests.day9_driver_actions_uploads;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UploadPractice {

    //We don't have to have setupMethod anymore UNLESS we want to create additional structure for our tests.
//    @BeforeMethod
//    public void setUpMethod(){
//        Driver.getDriver().get("http://practice.cybertekschool.com/upload");
//    }

    @Test
    public void upload_test(){
        //driver = Driver.getDriver()
        Driver.getDriver().get("http://practice.cybertekschool.com/upload");

        //Find any file that is not too big in size. And get the path of the file.
        String path = "/Users/cybertekchicago-1/Desktop/fileToUpload.png";

        WebElement chooseFile = Driver.getDriver().findElement(By.id("file-upload"));

        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));



    }


}
