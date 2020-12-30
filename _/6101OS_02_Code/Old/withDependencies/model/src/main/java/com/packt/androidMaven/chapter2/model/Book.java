package com.packt.androidMaven.chapter2.model;

public class Book {

    private Integer id;
    private String title;
    private String format;
    private String color;
    private Integer numberOfPages;
    private Boolean brandNew;

    public Book() {
    }

    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", format='" + format + '\'' +
                ", color='" + color + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", brandNew=" + brandNew +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setBrandNew(Boolean brandNew) {
        this.brandNew = brandNew;
    }
}
