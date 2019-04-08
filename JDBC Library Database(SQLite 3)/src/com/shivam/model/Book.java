package com.shivam.model;

public class Book {
    private int ISBN;
    private String Title;
    private String Author;
    private String Publisher;

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    public String getPublisher() {
        return Publisher;
    }
}
