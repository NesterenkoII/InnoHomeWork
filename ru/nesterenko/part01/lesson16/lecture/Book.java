package ru.nesterenko.part01.lesson16.lecture;

public class Book {

    private String title;
    private String author;
    private String yearOfFound;

    public Book(String title, String author, String yearOfFound) {
        this.title = title;
        this.author = author;
        this.yearOfFound = yearOfFound;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getYearOfFound() {
        return yearOfFound;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYearOfFound(String yearOfFound) {
        this.yearOfFound = yearOfFound;
    }
}
