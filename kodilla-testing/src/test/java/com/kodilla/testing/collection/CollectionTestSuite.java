package com.kodilla.testing.collection;

import org.junit.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CollectionTestSuite {

    @Before //So before and after run before and after every test
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        System.out.println("Testing empty ArrayList");
        ArrayList<Integer> result = exterminator.exterminate(new ArrayList<Integer>());

        //Then
        Assert.assertEquals(new ArrayList<Integer>(), result);
    }
    //Assuming 0 is even number
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        System.out.println("Testing ArrayList with numbers");
        ArrayList<Integer> dummyData = new ArrayList<>();
        dummyData.add(0);
        dummyData.add(1);
        dummyData.add(2);
        dummyData.add(3);
        dummyData.add(4);
        dummyData.add(5);
        dummyData.add(6);

        ArrayList<Integer> result = exterminator.exterminate(dummyData);

        dummyData.remove(5);
        dummyData.remove(3);
        dummyData.remove(1);

        //Then
        Assert.assertEquals(dummyData, result);
    }
}
