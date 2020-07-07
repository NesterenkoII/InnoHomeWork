package ru.nesterenko.part01.lesson12.task02;

/**
 * Заставить программу ”Hello, World!” упасть…
 * Смоделировав ошибку «ArrayIndexOutOfBoundsException»
 *
 * @version 1.0 7 July 2020
 * @author NII
 */
public class ArrayIndexOutOfBoundsException {

    public static void main(String[] args) {

        System.out.printf("Hello World! %d", args[2]);
    }
}
