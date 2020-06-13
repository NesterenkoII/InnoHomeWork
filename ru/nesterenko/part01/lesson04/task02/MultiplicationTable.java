package ru.nesterenko.part01.lesson04.task02;

/**
 * Написать программу для вывода на экран таблицы умножения.
 *
 * @version 1.0 13 June 2020
 * @author  Igor nesterenko
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        int[][] multiplicationTable = new int[9][9];

        System.out.println("          Таблица умножения");
        for (int i = 0; i < multiplicationTable.length; i++) {
            for (int j = 0; j < multiplicationTable[i].length; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
                System.out.printf("%3d ", multiplicationTable[i][j]);
            }
            System.out.println();
        }
    }
}
