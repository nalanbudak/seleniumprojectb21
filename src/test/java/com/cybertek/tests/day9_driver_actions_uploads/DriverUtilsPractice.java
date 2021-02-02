package com.cybertek.tests.day9_driver_actions_uploads;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DriverUtilsPractice {

    @Test
    public void simple_google_search_test(){

        //Go to google.com

//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("https://www.google.com");

        //Driver.getDriver() = driver
        Driver.getDriver().get("https://www.google.com");

        //Search for a value
        WebElement searchBox = Driver.getDriver().findElement(By.name("q"));

        String searchValue = "wooden spoon";

        searchBox.sendKeys(searchValue + Keys.ENTER);

        //Assert title contains the value



    }


}
