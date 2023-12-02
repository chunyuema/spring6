package com.chunyue.spring6.iocxml.dependencyinjection;

public class Book {
    private String title;
    private String author;

    public Book(){
        System.out.println("Non-argument constructor is executed");
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        System.out.println("Argumented constructor is executed");
    }

    // To use setter for dependency injection, we need setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
