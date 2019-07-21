package com.kodilla.spring.calculator;

import com.kodilla.spring.forum.ForumUser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        Double sum = calculator.add(5,10);
        Double sub = calculator.subtract(5,10);
        Double mul = calculator.mul(5,10);
        Double div = calculator.div(5,10);
        //Then
        Assert.assertEquals(sum,(double)5+10,0.01);
        Assert.assertEquals(sub,(double)5-10,0.01);
        Assert.assertEquals(mul,(double)5*10,0.01);
        Assert.assertEquals(div,(double)5/10,0.01);
    }
}