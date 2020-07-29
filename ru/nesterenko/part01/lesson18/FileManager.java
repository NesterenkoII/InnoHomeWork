package ru.nesterenko.part01.lesson18;

import java.io.*;
import java.util.Scanner;

public class FileManager {

    public static void createFile(String path) throws IOException {
        File file = new File(path);
        if (file.createNewFile()) {
            System.out.printf("%s: <created>\n", file.getName());
        }
    }

    public static void writeToFile(String path, String writingLine, String writeWithCodding) throws IOException {
        OutputStream os = new FileOutputStream(path);
        Writer writer = new OutputStreamWriter(os, writeWithCodding);
        writer.write(writingLine);
        writer.close();
        os.close();
    }

    public static void printFile(String path) throws NullPointerException, FileNotFoundException {
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("Файл не существует");
        } else {
            Scanner scanner = new Scanner(file);
            System.out.printf("\n%s: {\n", file.getName());
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
            System.out.println("}\n");
            scanner.close();
        }
    }

    public static void copyToFileWithCodding(String fromPath, String toPath, String copyWithCodding) throws IOException  {
        InputStream is = new FileInputStream(fromPath);
        Reader reader = new InputStreamReader(is);
        OutputStream os = new FileOutputStream(toPath);
        Writer writer = new OutputStreamWriter(os, copyWithCodding);
        while (reader.ready()) {
            writer.write(reader.read());
        }
        reader.close();
        is.close();
        writer.close();
        os.close();
    }
}
