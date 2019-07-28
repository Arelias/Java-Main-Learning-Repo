package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks(){

        //Given
        Library library1 = new Library("Library one");
        Library deepClonedLibrary = null;
        Library shallowClonedLibrary = null;
        Book bookToBeRemoved = new Book("123", "456", LocalDate.now().plusDays(10));
        library1.getBooks().add(bookToBeRemoved);
        library1.getBooks().add(new Book("AAA1", "BBB1", LocalDate.now()));
        library1.getBooks().add(new Book("AAA2", "BBB2", LocalDate.now()));
        library1.getBooks().add(new Book("AAA3", "BBB3", LocalDate.now()));
        library1.getBooks().add(new Book("AAA4", "BBB4", LocalDate.now()));
        library1.getBooks().add(new Book("AAA5", "BBB5", LocalDate.now()));

        try{
            deepClonedLibrary = library1.deepCopy();
            deepClonedLibrary.setName("Deep Cloned library");


        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        try{
            shallowClonedLibrary = library1.shallowCopy();
            shallowClonedLibrary.setName("Shallow Cloned library");


        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //When
        Book bookToBeAdded = new Book("ASD", "ZXC", LocalDate.now().plusDays(5));
        deepClonedLibrary.getBooks().add(bookToBeAdded);
        shallowClonedLibrary.getBooks().remove(bookToBeRemoved);

        //Then
        Assert.assertEquals(5,library1.getBooks().size());
        Assert.assertEquals(5,shallowClonedLibrary.getBooks().size());
        Assert.assertEquals(7,deepClonedLibrary.getBooks().size());
        Assert.assertEquals(library1.getBooks().size(),shallowClonedLibrary.getBooks().size());
        Assert.assertNotEquals(library1.getBooks().size(),deepClonedLibrary.getBooks().size());

    }

}
