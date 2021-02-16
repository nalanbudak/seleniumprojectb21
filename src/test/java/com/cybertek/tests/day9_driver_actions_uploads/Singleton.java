package com.cybertek.tests.day9_driver_actions_uploads;

public class Singleton {


    private Singleton(){}      //By making the constructor private, we are limiting creating object from this class

    private static String word;      //By making the String, we can only reach this using getter method

    public static String getWord(){      //By creating 'getter' method, we will allow user to reach to String in the way we allow them to


        if(word == null){
            System.out.println("First time call. Word object is null" +
                    "Assigning value to it now.");
            word = "something";
        }else{
            System.out.println("Word already has a value.");
        }

        return word;
    }

}
/*      SINGLETON DESIGN PATTERN:

        1- We create *private constructor.

        2- We create a ***getter method*** for the object of this class so that it will be returned in the way we want to offer.

              - Singleton Design Pattern returns the **SAME OBJECT** at all times.
              - We want to return same driver instance (session) everytime/everywhere we use it.   */