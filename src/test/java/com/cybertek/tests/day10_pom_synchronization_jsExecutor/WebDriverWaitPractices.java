package com.cybertek.tests.day10_pom_synchronization_jsExecutor;

import com.cybertek.pages.DynamicLoad7Page;
import com.cybertek.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriverWaitPractices {

    @Test
    public void dynamic_load_7(){
        // TC#40: Dynamically Loaded Page Elements 7
        // 1.Go to http://practice.cybertekschool.com/dynamic_loading/7
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/7");

        // 2.Wait until title is "Dynamic title"

        DynamicLoad7Page dynamicLoad7Page = new DynamicLoad7Page();

        // 3.Assert : Message "Done" is displayed.
        Assert.assertTrue(dynamicLoad7Page.infoMessage.isDisplayed());

        // 4.Assert : Image is displayed.
        Assert.assertTrue(dynamicLoad7Page.spongeBobImage.isDisplayed());

        // Note: Follow POM
    }
}
