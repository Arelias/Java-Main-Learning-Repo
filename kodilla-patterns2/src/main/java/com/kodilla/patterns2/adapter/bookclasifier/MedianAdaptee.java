package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.libaryb.Book;
import com.kodilla.patterns2.adapter.bookclasifier.libaryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifier.libaryb.BookStatistics;
import com.kodilla.patterns2.adapter.bookclasifier.libaryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {
    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        Statistics statistics = new Statistics();
        return statistics.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        Statistics statistics = new Statistics();
        return statistics.medianPublicationYear(books);
    }
}
