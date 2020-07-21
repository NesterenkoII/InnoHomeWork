package ru.nesterenko.part01.lesson17;

/**
 *Есть набор объектов типа “Книга”. Каждая книга имеет название, автора, год издания. Можно больше, по желанию.
 * Программа должна уметь:
 * ● добавлять книгу в библиотеку.
 * ● показывать список книг в библиотеке.
 * ● восстанавливать содержимое библиотеки после перезапуска, используя ObjectInputStream/ObjectOutputStream.
 * ● показывать соответствующее сообщение в случае ошибок.
 * Важно!
 * ● потоки обязательно должны закрываться
 * ● отсутствие файла на диске - не ошибка, а частный случай пустой библиотеки.
 *
 * @version 1.0 19 July 2020
 * @author  NII
 */
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.uploadLibraryList();
        library.showLibrary();
        library.addBook(new Book("title1","author1", "1955"));
        library.addBook(new Book("title2","author2", "1966"));
        library.addBook(new Book("title3","author3", "1977"));
        library.addBook(new Book("title4","author4", "1988"));
        library.showLibrary();
    }
}
