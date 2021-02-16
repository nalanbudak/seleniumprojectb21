package com.cybertek.tests.day8_testbase_properties_driver;

import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingFromProperties {

    @Test
    public void reading_from_properties_file() throws IOException {

        Properties properties = new Properties();  //#1- Create Properties class object

        //#2- Open the file in JVM Memory and pass the path of the file
        String path = "configuration.properties";                  //For windows > copy path > copy path from content root
                                                                 //for mac====>configuration properties =>right click==>cpoy path===> copy path content root
        FileInputStream file = new FileInputStream(path);

        properties.load(file); //#3- Load the opened file into the Properties object.


        //read some values from the file
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));

        //write statement that is returning johndoe
        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));
    }

    @Test
    public void using_properties_util_method(){
        System.out.println("ConfigurationReader.getProperty(\"browser\") = " + ConfigurationReader.getProperty("browser"));
        System.out.println("ConfigurationReader.getProperty(\"url\") = " + ConfigurationReader.getProperty("url"));

    }


}
      /*  How to read from Properties file using java?

            1- Create object of Properties class.
               Properties properties = new Properties();

            2- Use FileInputStream to open the file.
              FileInputStream file = new FileInputStream(path);

            3- Load the opened file into properties object.
              properties.load(file);

            4- Then we can use properties object to get the value of given key
                properties.getProperty(keyWord);     */