package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
   private static Properties properties = new Properties();

    static {
        FileInputStream file= null;
        try {
            file = new FileInputStream("configuration.properties");
            properties.load(file);

            // close the file
            file.close();

        } catch (IOException e) {
            System.out.println("Some problem occured");
            e.printStackTrace();
        }
    }

    // we creaste a method to use the code above

    public static String getProperty (String keyword){
        return properties.getProperty(keyword); // it will bring chrome us from configurtion.properties class
    }



}
