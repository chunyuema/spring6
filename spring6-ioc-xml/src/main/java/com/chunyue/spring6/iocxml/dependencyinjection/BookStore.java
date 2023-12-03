package com.chunyue.spring6.iocxml.dependencyinjection;

import java.util.Arrays;
import java.util.List;

public class BookStore {
    private String[] dummies;
    private List<Book> books;

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

    @Override
    public String toString() {
        return "BookStore{" +
                "dummies=" + Arrays.toString(dummies) +
                ", books=" + books +
                '}';
    }
}
