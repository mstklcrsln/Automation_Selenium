package com.cydeo.tests.short_videos;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFaker {

    @Test
    public void fakerTest (){
        Faker faker = new Faker();

        System.out.println("faker.name().fullName() = " + faker.name().fullName());
        System.out.println("faker.address().fullAddress() = " + faker.address().fullAddress());
        System.out.println("faker.address().city() = " + faker.address().city());
        System.out.println("faker.address().buildingNumber() = " + faker.address().buildingNumber());
        System.out.println("faker.number().numberBetween(20,100) = " + faker.number().numberBetween(20, 100));
        System.out.println("faker.numerify(\"###- ###-####\") = " + faker.numerify("###- ###-####"));
        System.out.println("faker.letterify(\"?????\") = " + faker.letterify("?????"));
        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard());

    }
}
