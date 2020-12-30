package com.packt.androidMaven.chapter2.service.impl;

import com.packt.androidMaven.chapter2.model.Book;
import com.packt.androidMaven.chapter2.service.BookService;

/**
 * Implementation class for BookService
 */
public class BookServiceImpl implements BookService {
    @Override
    public Book createBook(String title, String format, String color, Integer numberOfPages) {
        final Book book = new Book();
        book.setTitle(title);
        book.setFormat(format);
        book.setColor(color);
        book.setNumberOfPages(numberOfPages);
        return book;
    }
}
