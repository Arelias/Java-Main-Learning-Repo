package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World();

        Continent asia = new Continent();
        asia.addCountry(new Country(new BigDecimal("1111")));
        asia.addCountry(new Country(new BigDecimal("2222")));
        asia.addCountry(new Country(new BigDecimal("3333")));

        Continent africa = new Continent();
        africa.addCountry(new Country(new BigDecimal("4444")));
        africa.addCountry(new Country(new BigDecimal("5555")));
        africa.addCountry(new Country(new BigDecimal("6666")));

        Continent australia = new Continent();
        australia.addCountry(new Country(new BigDecimal("7777")));
        australia.addCountry(new Country(new BigDecimal("8888")));
        australia.addCountry(new Country(new BigDecimal("9999")));

        world.addContinent(asia);
        world.addContinent(africa);
        world.addContinent(australia);

        //When
        BigDecimal totalSand = world.getPeopleQuantity();

        //Then
        BigDecimal expectedSand = new BigDecimal("49995");
        Assert.assertEquals(expectedSand, totalSand);

    }
}
