package com.cybertek.tests.day5_testNG_intro_dropdowns;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Introduction {

   @BeforeClass
   public void setupClass(){
       System.out.println("Before class is running...");
   }

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
