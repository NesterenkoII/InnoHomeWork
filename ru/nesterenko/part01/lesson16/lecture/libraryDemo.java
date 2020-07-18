package ru.nesterenko.part01.lesson16.lecture;

import java.util.ArrayList;
import java.util.List;

public class libraryDemo {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("News", "Vova", "1984"));
        books.add(new Book("Grammar", "Lidiya", "1955"));
        List<Book> booksWrapper = new ArrayList<>();
        booksWrapper.add(books.get(0));

        print(books.get(0));
        print(booksWrapper.get(0));
    }

    public static void print(Book book) {
        System.out.println(book.getTitle() + ", " + book.getAuthor() + ", " + book.getYearOfFound());
    }

    public static void print(BookWrapper bookWrapper) {
        System.out.println(bookWrapper.getTitle() + ", " + bookWrapper.getAuthor() + ", " + bookWrapper.getYearOfFound());
    }
}
