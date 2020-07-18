package ru.nesterenko.part01.lesson16.lecture;

public class BookWrapper extends Book {

    private Book original;

    public BookWrapper(String title, String author, String yearOfFound) {
        super(title, author, yearOfFound);
    }

    public BookWrapper(Book book) {
        super(book.getTitle(), book.getAuthor(), book.getYearOfFound());
    }

    @Override
    public String getTitle() {
        return ("Название книги: " + super.getTitle());
    }

    @Override
    public String getAuthor() {
        return ("Автор: " + super.getAuthor());
    }

    @Override
    public String getYearOfFound() {
        return ("Год издаия: " + super.getYearOfFound());
    }
}
