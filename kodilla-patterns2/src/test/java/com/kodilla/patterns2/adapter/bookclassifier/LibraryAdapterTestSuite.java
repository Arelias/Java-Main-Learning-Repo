package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class LibraryAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("Sapkowski", "Miecz przeznaczenia 1", 1995, "SPK1")) ;
        books.add(new Book("Sapkowski", "Miecz przeznaczenia 2", 1996, "SPK2")) ;
        books.add(new Book("Sapkowski", "Miecz przeznaczenia 3", 1997, "SPK3")) ;
        books.add(new Book("Sapkowski", "Miecz przeznaczenia 4", 1998, "SPK4"));
        books.add(new Book("Sapkowski", "Miecz przeznaczenia 5", 1999, "SPK5")) ;
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int medianYear = medianAdapter.publicationYearMedian(books);
        //Then
        System.out.println(medianYear);
        assertEquals(medianYear, 1997);
    }
}
