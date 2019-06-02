package com.mentor.zadanie;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ZadanieTestSuite {


    @Test
    public void testDuplicates(){

        ArrayList<Integer> listaLiczb = new ArrayList<>();
        listaLiczb.add(1);
        listaLiczb.add(2);
        listaLiczb.add(3);
        listaLiczb.add(4);
        listaLiczb.add(5);
        listaLiczb.add(6);
        listaLiczb.add(6);
        listaLiczb.add(7);
        listaLiczb.add(8);
        listaLiczb.add(9);

        Zadanie zad = new Zadanie();

        Assert.assertEquals(6, zad.showDuplicates(listaLiczb));



    }
    @Test
    public void testDuplicates2(){

        ArrayList<Integer> listaLiczb = new ArrayList<>();
        listaLiczb.add(1);
        listaLiczb.add(2);
        listaLiczb.add(3);
        listaLiczb.add(4);
        listaLiczb.add(5);
        listaLiczb.add(6);
        listaLiczb.add(7);
        listaLiczb.add(8);
        listaLiczb.add(9);
        listaLiczb.add(2);

        Zadanie zad = new Zadanie();

        Assert.assertEquals(2, zad.showDuplicates(listaLiczb));

    }
}
//Przykład 2:
//- dane wejsciowe: 1, 2, 3, 4, 5, 6, 7, 8, 9, 2
//- wynik: 2
//