package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;


public class CollectionTestSuite {



    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("Test checking if the class worked when the list is empty")

    @Test
    void testOddNumbersExterminatorEmptyList() {

        //Given - jaki stan ma aplikacja na dany moment testowania metody
        List <Integer> numbersList = new ArrayList<Integer>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When - co będe testował
        exterminator.exterminate(numbersList);
        List <Integer> resultList = exterminator.exterminate(numbersList);
        //Then - co będę oczekiwał od tego testu
        Assertions.assertEquals(0, resultList.size());
    }

    @DisplayName("Test checking if the class worked correctly when the list contains even and odd numbers")

    @Test
     void testOddNumbersExterminatorNormalList(){
        //Given - jaki stan ma aplikacja na dany moment testowania metody
        List <Integer> numbersList = new ArrayList<Integer>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(4);
        numbersList.add(5);
        numbersList.add(6);

        List <Integer> expectedList = new ArrayList<Integer>();
        expectedList.add(2);
        expectedList.add(4);
        expectedList.add(6);

        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When - co będe testował
        List <Integer> resultList = exterminator.exterminate(numbersList);

        //Then - co będę oczekiwał od tego testu

        Assertions.assertEquals(expectedList, resultList );

    }
}
