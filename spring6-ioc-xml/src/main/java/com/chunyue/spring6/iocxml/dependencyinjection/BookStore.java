package com.chunyue.spring6.iocxml.dependencyinjection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class BookStore {
    private String[] dummies;
    private List<Book> books;
    private Map<Publisher, Book> publisherBookMap;

    public String[] getDummies() {
        return dummies;
    }

    public void setDummies(String[] dummies) {
        this.dummies = dummies;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Map<Publisher, Book> getPublisherBookMap() {
        return publisherBookMap;
    }

    public void setPublisherBookMap(Map<Publisher, Book> publisherBookMap) {
        this.publisherBookMap = publisherBookMap;
    }

    @Override
    public String toString() {
        return "BookStore{" +
                "dummies=" + Arrays.toString(dummies) +
                ", books=" + books +
                ", publisherBookMap=" + publisherBookMap +
                '}';
    }
}
