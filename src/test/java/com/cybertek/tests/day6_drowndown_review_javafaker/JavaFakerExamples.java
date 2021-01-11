package com.cybertek.tests.day6_drowndown_review_javafaker;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerExamples {


    @Test
    public void java_faker_test1(){
        //We need to create an object of the JavaFaker
        Faker faker = new Faker();

        String firstName = faker.name().firstName();
        System.out.println("firstName = " + firstName);

        String lastName = faker.name().lastName();
        System.out.println("lastName = " + lastName);

        String fullName = faker.name().fullName();
        System.out.println("fullName = " + fullName);


    }
}
