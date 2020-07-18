package ru.nesterenko.part01.lesson15.task01;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import static ru.nesterenko.part01.lesson15.task01.FileManager.*;


/**
 * Написать программу, которая будет создавать, переименовывать, копировать и удалять файл.
 * Написать рекурсивный обход всех файлов и подкаталогов внутри заданного каталога.
 * Дополнительное задание (необязательно): программа должна следить за глубиной рекурсии,
 * сдвигая название файла/каталога на соответствующее количество пробелов.
 *
 * @version 1.0 15 July 2020
 * @author  NII
 */
public class DirectoryDemo {

    public static void main(String[] args) throws IOException {

        StringBuilder duringDirectory = new StringBuilder("/Users/NII/Desktop/Development/src/ru/nesterenko/part01/lesson15/");
        int choice = -1;

        do {
            try {
                fileManagerMenu();
                System.out.println(duringDirectory);

                Scanner enter = new Scanner(System.in);
                choice = enter.nextInt();
            switch (choice) {
                case 1:
                    createFolder(duringDirectory);
                    break;
                case 2:
                    createFile(duringDirectory);
                    break;
                case 3:
                    deleteFolder(duringDirectory);
                    break;
                case 4:
                    deleteFile(duringDirectory);
                    break;
                case 5:
                    duringDirectory = changeDir(duringDirectory);
                    break;
                case 6:
                    duringDirectory = previousDir(duringDirectory);
                    break;
                case 7:
                    dirList(duringDirectory);
                    break;
                case 8:
                    renameFolder(duringDirectory);
                    break;
                case 9:
                    copyFile(duringDirectory);
                    break;
                case 10:
                    copyFolder(duringDirectory);
                    break;
                case 0:
                    System.out.println("Exit ...");
                    return;
                default:
                    System.out.println("Point of menu is not found");
            }
            } catch (InputMismatchException ex) {
                ex.getStackTrace();
                System.out.println("Неверный формат ввода!");
            }
        } while (choice != 0);
    }
}
