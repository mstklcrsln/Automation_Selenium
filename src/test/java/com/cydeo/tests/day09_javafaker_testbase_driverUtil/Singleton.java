package com.cydeo.tests.day09_javafaker_testbase_driverUtil;

public class Singleton {

    // create private constructor
    private Singleton (){}

    //private static string.  prevent access and provide getter method
    private static String word;

    //this utility method will return the word in the way we want to return
    public static String getWord() {
       if(word==null){
           System.out.println("Word object is null");
           word= "something";
       }else {
           System.out.println("Word has already value");
       }
        return word;
    }



}
