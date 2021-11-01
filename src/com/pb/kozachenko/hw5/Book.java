package com.pb.kozachenko.hw5;

public class Book {
    private String title;
    private String author;
    private int yearOfPublishing;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getInfoBook() {
        return "название: " + title + ", автор: " + author + ", год публикации: " + yearOfPublishing;
    }
}
