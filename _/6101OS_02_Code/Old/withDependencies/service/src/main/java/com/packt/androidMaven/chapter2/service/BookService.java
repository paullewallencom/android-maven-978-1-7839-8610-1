package com.packt.androidMaven.chapter2.service;

import com.packt.androidMaven.chapter2.model.Book;

public interface BookService {
    //    Service that instances an object of type Book
    Book createBook(String title, String format, String color, Integer numberOfPages);
}
