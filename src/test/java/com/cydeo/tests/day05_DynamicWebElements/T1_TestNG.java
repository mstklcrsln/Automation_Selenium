package com.cydeo.tests.day05_DynamicWebElements;

import org.testng.annotations.*;

public class T1_TestNG {

        @BeforeClass
        public void beforeClass (){
                System.out.println("Before class is running");
        }

        @BeforeMethod
        public void before(){
                System.out.println("Before test is running");
        }
        @Test (priority = 1)
        public void test1(){
                System.out.println("Test1 is running");
        }

        @Test (priority = 9)
        public void test2(){
                System.out.println("Test2 is running");
        }
        @Test (priority = 2)
        public void test3(){
                System.out.println("Test3 is running");
        }

        @AfterMethod
        public void after(){
                System.out.println("After test is running");
        }
        @AfterTest
        public void afterTest(){
                System.out.println("After test is running");
        }
        /*
        Before class is running
        Before test is running
        Test1 is running
        After test is running
        Before test is running
        Test3 is running
        After test is running
        Before test is running
        Test2 is running
        After test is running
        After test is running
         */


}
