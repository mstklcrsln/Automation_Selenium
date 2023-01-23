package com.cydeo.tests.day09_javafaker_testbase_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JAvaFakerExamples {
    @Test
    public void test1(){

        Faker faker =new Faker();

     //   javaFaker.fakerTest();
       // System.out.println("javaFaker.toString() = " + javaFaker.toString());

        System.out.println("faker.name().fullName() = " + faker.name().fullName()); //faker.name().fullName() = Mrs. Sonny MacGyver

        System.out.println("faker.bothify(\"###???- ^#??- -- ####?????\") = " + faker.bothify("###???- ^#??- -- ####?????")); //faker.bothify("###???- ^#??- -- ####?????") = 613sip- ^1hc- -- 2210lrnie

    }
}
