package com.cydeo.tests.day08_configurationReader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_from_properties_test () throws IOException {
        // create an object from property class
        Properties properties = new Properties();

        // we need to open the file in the java memory
        FileInputStream file= new FileInputStream("configuration.properties");
        //on the cof class + right click+copy path/reference + path from content rooth

        // load the propeeties object
        properties.load(file);

        //use properties object to read value
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));//properties.getProperty("browser") = chrome;
        System.out.println("properties.getProperty(\"env\") = " + properties.getProperty("env")); //properties.getProperty("env") = https://login.nextbasecrm.com

    }
}
