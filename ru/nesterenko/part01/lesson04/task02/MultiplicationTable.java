package ru.nesterenko.part01.lesson04.task02;

/**
 * Написать программу для вывода на экран таблицы умножения.
 *
 * @version 1.0 13 June 2020
 * @author  Igor nesterenko
 */
public class MultiplicationTable {
    public static void main(String[] args) {

        System.out.println("          Таблица умножения");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%3d ", (i + 1) * (j + 1));
            }
            System.out.println();
        }
    }
}
