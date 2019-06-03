package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;


public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    //    //If returned list is > 20 elements, return null
//    //If title fragments is shorter > 3 chars, return null
//    //Else return the book list
    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        //This makes this work, we call that function from our interface compatible object,
        //mockito kicks in, returns what we established, then that goes into assert in the test
        //preivous method below just returned single elements, didnt use interface function
        List<Book> resultList = libraryDatabase
                .listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        List<Book> bookList = libraryDatabase.listBooksInHandsOf(libraryUser);

        return bookList;
    }
}

//    public List<Book> listBooksWithCondition(String titleFragment) {
//        List<Book> bookList = new ArrayList<Book>();
//        Book book = new Book("The book title", "The book author", 2000);
//        bookList.add(book);
//
//        // temporary returning list of one book
//        return bookList;
//    }

