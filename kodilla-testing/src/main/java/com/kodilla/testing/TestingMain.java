package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

import java.sql.SQLOutput;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator addNumbers = new Calculator();
        int resultOfAdd = addNumbers.addAToB(5, 10);
        System.out.println(resultOfAdd);

        //Test 1
        if (resultOfAdd == 15){
            System.out.println("Test is OK!");
        } else {
            System.out.println("Error");
        }

        //Test 2
        Calculator substractNumbers = new Calculator();
        int resultOfSubtsract = substractNumbers.substractAToB(15, 5);
        System.out.println(resultOfSubtsract);

        if (resultOfSubtsract == 10){
            System.out.println("Test is OK!");
        } else {
            System.out.println("Error!");
        }


    }
}
