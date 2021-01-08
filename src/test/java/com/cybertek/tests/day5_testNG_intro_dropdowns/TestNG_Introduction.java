package com.cybertek.tests.day5_testNG_intro_dropdowns;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Introduction {

    /*
    @BeforeClass will make the method run once before everything else in the class.
     */
   @BeforeClass
   public void setupClass(){
       System.out.println("Before class is running...");
   }

    /*
     @AfterClass will make the method run once after everything else in the class.
      */
   @AfterClass
   public void teardownClass(){
       System.out.println("After class is running...");
   }


   @Test
   public void test1(){
       System.out.println("Running test 1...");
   }

   @Test
   public void test2(){
       System.out.println("Running test 2...");
   }

}
