package com.cybertek.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

     //    In this class we will implement the repeated steps of reading
    //      from configuration.properties file

    //#1- Create the object of Properties
    private static Properties properties = new Properties();

   //#2- Get the path and open the file
     static {
        try {   //
            FileInputStream file = new FileInputStream("configuration.properties");
            //#3- Load the opened file into properties object
            properties.load(file);
            file.close();   //closing the file in JVM Memory

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //#4- Use the object to read from the configuration.properties file
    public static String getProperty(String keyWord) {
        return properties.getProperty(keyWord);
    }


}


// static block===> whatever we put in static block, it will be  executed from everything
//consola herseyden once yazdirilir
