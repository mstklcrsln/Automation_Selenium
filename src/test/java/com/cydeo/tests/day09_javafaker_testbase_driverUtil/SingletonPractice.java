package com.cydeo.tests.day09_javafaker_testbase_driverUtil;

import org.testng.annotations.Test;

public class SingletonPractice {
    @Test
    public void singleton_understand_test1(){
        String str1= Singleton.getWord();
        System.out.println("str1 = " + str1);
        /*
        Word object is null
        str1 = something
         */
        String str2= Singleton.getWord();
        System.out.println("str2 = " + str2);


        String str3= Singleton.getWord();
        System.out.println("str3 = " + str3);

                /*
                Word object is null
                str1 = something
                Word has already value
                str2 = something
                Word has already value
                str3 = something
                 */
    }

    @Test
    public void singleton_understand_test2(){
        String str4= Singleton.getWord();
        System.out.println("str4 = " + str4);
        /*
        First time call. Word object is null
        str1 = something
        Word has already value
        str2 = something
        Word has already value
        str3 = something
        Word has already value
        str4 = something
         */
    }
}
