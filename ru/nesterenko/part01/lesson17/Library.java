package ru.nesterenko.part01.lesson17;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private static List<Book> bookList;
    private transient String libraryPath = "/Users/NII/Desktop/Development/src/ru/nesterenko/part01/lesson17/library.dat";

    public Library() {
        bookList = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookList.add(book);
        downloadLibraryList();
    }

    public void downloadLibraryList() {
        File file = new File(libraryPath);
        try {
            if (!file.exists()) {
                System.out.println("<Библиоека создана>");
                file.createNewFile();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try (OutputStream os = new FileOutputStream(libraryPath);
             ObjectOutputStream oos = new ObjectOutputStream(os)) {

            oos.writeObject(bookList);
            oos.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void uploadLibraryList() {
        try (InputStream is = new FileInputStream(libraryPath);
             ObjectInputStream ois = new ObjectInputStream(is)) {
            this.bookList = (ArrayList<Book>) ois.readObject();
        } catch (ClassNotFoundException ex) {
            System.out.println("<Ошибка программы>");
        } catch (IOException e) {
            System.out.println("<Файл с библиотекой еще не создан>");
        }
    }

    public void showLibrary() {
        if (bookList.isEmpty()) {
            System.out.println("<Пустая библиотека>");
        } else {
            int i = 1;
            for (Book b : bookList) {
                System.out.println(i + ". " + b.toString());
                i++;
            }
        }
    }
}
