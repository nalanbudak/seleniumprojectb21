package com.cybertek.tests.day6_drowndown_review_javafaker;

import com.cybertek.utilities.WebDriverFactory;
import com.cybertek.utilities.WebOrderUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebOrder_Practices {


    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //1. Open browser
        //2. Go to website:
        //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver = WebDriverFactory.getDriver("chrome");

        //2. Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        //maximize
        driver.manage().window().maximize();

        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebOrderUtils.loginToSmartBear(driver);

    }

    @Test
    public void test2_create_order_with_java_faker(){
        //6. Click on Order
        //7. Select familyAlbum from product, set quantity to 2
        //8. Click to “Calculate” button
        //9. Fill address Info with JavaFaker
        //• Generate: name, street, city, state, zip code
        //10. Click on “visa” radio button
        //11. Generate card number using JavaFaker
        //12. Click on “Process”
        //13.Verify success message “New order has been successfully added.
    }




    @Test
    public void test1_link_verifications(){


        //6. Print out count of all the links on landing page
        List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));

        System.out.println("Number of all links in this page: " + allLinks.size());

        //7. Print out each link text on this page
        for (WebElement each : allLinks) {

            System.out.println("eachLink = "+each.getText());

        }


    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {

        //additional 5 seconds before closing the browser
        Thread.sleep(5000);

        driver.close();

    }


}
