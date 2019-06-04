package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        //Given
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        int[] numbers2 = {3,3,3,3,3,3,3,3,3};
        int[] numbers3 = {1,3,5,7,9};

        //When
        double avg = ArrayOperations.getAverage(numbers);
        double avg2 = ArrayOperations.getAverage(numbers2);
        double avg3 = ArrayOperations.getAverage(numbers3);

        //Then
        Assert.assertEquals(5, avg, 0.001);
        Assert.assertEquals(3, avg2, 0.001);
        Assert.assertEquals(5, avg3, 0.001);


    }
}
