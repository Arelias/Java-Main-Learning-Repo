package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigMacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient("ONION")
                .sauce("BBQ")
                .burgers(2)
                .ingredient("CHILLI")
                .ingredient("MUSHROOMS")
                .bunSesame(false)
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(3, howManyIngredients);
        Assert.assertFalse(bigmac.isBunSesame());
        Assert.assertEquals("BBQ", bigmac.getSauce());
        Assert.assertEquals((Integer)2, bigmac.getBurgers());
    }
}
