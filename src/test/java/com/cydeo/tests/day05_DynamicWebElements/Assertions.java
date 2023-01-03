package com.cydeo.tests.day05_DynamicWebElements;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {

    String actual= "apple";
    String expected= "apple";
   @Test
    public void assertStudy (){
       System.out.println("Assert test");
       Assert.assertEquals(actual, expected); // for comparing two strings
    }

    @Test
    public void test(){
        System.out.println("test 2");
        String actual= "apple";
        String expected= "apple1";
        Assert.assertTrue(actual.equals(expected));
        /*
        Expected :true
        Actual   :false
         */
    }

}
