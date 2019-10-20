package com.kodilla.patterns2.decorator.taxiportal;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class TaxiOrderTestSuite {
    @Test
    public void testBasicTaxiOrderGetCost(){
        //Given
        TaxiOrder order = new BasicTaxiOrder();
        //When
        BigDecimal calculatedCost = order.getCost();
        //Then
        assertEquals(new BigDecimal(5.00), calculatedCost);
    }

    @Test
    public void testBasicTaxiOrderGetDescription(){
        //Given
        TaxiOrder order = new BasicTaxiOrder();
        //When
        String description = order.getDescription();
        //Then
        assertEquals("Drive a course", description);
    }

    @Test
    public void testTaxiNetworkGetCost(){
        //Given
        //Tworzony jest delegat taxiOrder a potem opakowany jest w dekorator
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);
        //When
        BigDecimal theCost = taxiOrder.getCost();
        //Then
        assertEquals(new BigDecimal(40.00), theCost);

    }

    @Test
    public void testTaxiNetworkGetDescription(){
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);
        //When
        String description = taxiOrder.getDescription();
        //Then
        assertEquals("Drive a course by Taxi network.", description);
    }

    @Test
    public void testMyTaxiWithChildSeatGetCost(){
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new MyTaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        //When
        BigDecimal theCost = taxiOrder.getCost();
        //Then
        assertEquals(new BigDecimal(37.00), theCost);
    }

    @Test
    public void testMyTaxiWithChildSeatGetDescription(){
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new MyTaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        //When
        String description = taxiOrder.getDescription();
        //Then
        assertEquals("Drive a course by MyTaxi network. + child seat", description);
    }

    @Test
    public void testMyTaxiWithTwoChildSeatsGetDescription(){
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new UberNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        //When
        String description = taxiOrder.getDescription();
        //Then
        assertEquals("Drive a course by Uber network. + child seat + child seat", description);
    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetCost(){
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new VipTaxiOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        System.out.println(taxiOrder.getCost());
        //When
        BigDecimal theCost = taxiOrder.getCost();
        //Then
        assertEquals(new BigDecimal(52.00), theCost);
    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetDescription(){
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new VipTaxiOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        System.out.println(taxiOrder.getDescription());
        //When
        String description = taxiOrder.getDescription();
        //Then
        assertEquals("Drive a course by Taxi network. variant VIP + child seat", description);
    }
}
