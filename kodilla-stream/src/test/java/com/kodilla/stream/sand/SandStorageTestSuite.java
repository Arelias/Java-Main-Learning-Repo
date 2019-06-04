package com.kodilla.stream.sand;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SandStorageTestSuite {
    @Test
    public void testGetSandBeansQuantity() {
        //Given
        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Europe());
        continents.add(new Asia());
        continents.add(new Africa());

        //When
        BigDecimal totalSand = BigDecimal.ZERO;
        for(SandStorage continent : continents){
            totalSand = totalSand.add(continent.getSandBeansQuantity());
        }

        //Then
        BigDecimal expectedSand = new BigDecimal("211111110903703703670");
        Assert.assertEquals(expectedSand, totalSand);
    }
    @Test
    public void testGetSandBeansQuantityWithReduce() {
        //Given
        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Europe());
        continents.add(new Asia());
        continents.add(new Africa());

        //When
        BigDecimal totalSand = continents.stream()
                .map(SandStorage::getSandBeansQuantity)
                //sum is value from previous step, so for first element its 0
                //then its value of first element
                //then first + 2nd, and so on
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        //Then
        BigDecimal expectedSand = new BigDecimal("211111110903703703670");
        Assert.assertEquals(expectedSand, totalSand);
    }
}