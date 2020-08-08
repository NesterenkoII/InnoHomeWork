package ru.nesterenko.part01.lesson18;

import java.io.IOException;
import static ru.nesterenko.part01.lesson18.fileMaker.*;

/**
 * Написать программу, которая копирует файл с одной кодировкой в файл с другой.
 *
 * @version 1.0 28 July
 * @author  NII
 */
public class EncodingTextFile {
    public static void main(String[] args) {
        String path = "/Users/NII/Desktop/Development/src/ru/nesterenko/part01/lesson18/";
        String fileName1 = "file1.txt";
        String fileName2 = "file2.txt";
        try {
            createFile(path + fileName1);
            createFile(path + fileName2);
            writeToFile(path + "file1.txt", "Some text\n line 1\n line 2", "ASCII");
            copyToFileWithCodding(path + "file1.txt",path + "file2.txt", "UTF-8");
            printFile(path + fileName1);
            printFile(path + fileName2);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
