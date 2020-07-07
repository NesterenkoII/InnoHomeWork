package ru.nesterenko.part01.lesson12.task01;

/**
 * Заставить программу ”Hello, World!” упасть…
 * Смоделировав ошибку «NullPointerException»
 *
 * @version 1.0 7 July 2020
 * @author NII
 */
public class NullPointerException {

    public static void main(String[] args) throws java.lang.NullPointerException {

        SomeClass someClass = null;
        someClass.field = 3;
        System.out.println("Hello World!");
    }

    class SomeClass {
        int field;
    }
}
