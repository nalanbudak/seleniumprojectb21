package com.cybertek.tests.day5_testNG_intro_dropdowns;

public class b_TestNG_Nedir {
}
  /*  What is TestNG?

        - TestNG is advanced **unit testing tool that allows us creating test flow using annotations.

     Why do we learn TestNG?

         - We learn testNG to take advantage of its annotations and reports.

    *****   Basics of TestNG   *****

                @Test:

         - @Test annotation allows us to create independent tests in our Java class.

         - Each test will be inpedent from each other unless we specifically create dependency

        .- If a test fails, code will continue executing the next test in our "test suite."

         - By default the tests will run in the alphabetical order, unless we create "priority"



     ******   @BeforeClass/@AfterClass   ******

        - BeforeClass======>

              - This method will run ONCE before everything else in the class.

              - Usually used for set up lines, such as: creating driver instance, opening browser, maximizing page, creating implicit waits etc.


      - AfterClass=========>

            - This method will run **ONCE after** everything else in the class

.           - Usually for closing stuff such as, driver.close() or driver.quit()

======================================

 ******  @BeforeMethod / @AfterMethod   *******

- BeforeMethod=======>- This method will run ONCE before each test in the class.

                      - Usually used for set up lines, such as: creating driver instance, opening browser, maximizing page, creating implicit waits etc.

- AfterMethod=======> - This method will run ONCE after each test in the class.
                      - Usually for closing stuff such as, driver.close() or driver.quit()  */