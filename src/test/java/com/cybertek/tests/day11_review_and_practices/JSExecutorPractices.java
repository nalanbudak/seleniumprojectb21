package com.cybertek.tests.day11_review_and_practices;

import com.cybertek.pages.SignUpPage;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class JSExecutorPractices {


    @Test
    public void fill_form_using_jsexecutor(){

        //getting the page
        Driver.getDriver().get("http://practice.cybertekschool.com/sign_up");

        //Create instance of JSExecutor and cast our WebDriver type to it
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //Creating the object to be able to use WebElements from it
        SignUpPage signUpPage = new SignUpPage();

        //Use .setAttribute function from JavaScript to sendKeys
        js.executeScript("arguments[0].setAttribute('value', 'jane doe')", signUpPage.inputFullName );



    }

}
