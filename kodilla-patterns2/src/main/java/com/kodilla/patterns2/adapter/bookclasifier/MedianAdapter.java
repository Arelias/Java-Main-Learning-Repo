package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.libaryb.Book;
import com.kodilla.patterns2.adapter.bookclasifier.libaryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;

import java.util.*;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    //zamienic ksiazki z formy A na B
    @Override
    public int publicationYearMedian(Set<com.kodilla.patterns2.adapter.bookclasifier.librarya.Book> bookSet) {
        Map<BookSignature, Book> books = new HashMap<>();
        for(com.kodilla.patterns2.adapter.bookclasifier.librarya.Book book : bookSet){
            Book tempBook = new Book(book.getAuthor(),book.getSignature(),book.getPublicationYear());
            BookSignature bookSignature = new BookSignature(book.getSignature());
            books.put(bookSignature, tempBook);
        }
        return medianPublicationYear(books);
    }
}
