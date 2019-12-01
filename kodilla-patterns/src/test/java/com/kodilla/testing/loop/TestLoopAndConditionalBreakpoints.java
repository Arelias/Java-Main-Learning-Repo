package com.kodilla.testing.loop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLoopAndConditionalBreakpoints {

    @Test
    public void testLoop(){
        //Given
        long sum = 0;
        //When
        for(int i = 0; i < 1000; i++){
            sum += i;
            System.out.println("Sum equals: " + sum + ". Index is: " + i);
        }
        //Then
        assertEquals(499500, sum);
    }
}
