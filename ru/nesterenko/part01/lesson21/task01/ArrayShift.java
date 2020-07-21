package ru.nesterenko.part01.lesson21.task01;

/**
 * Дан двумерный массив. Задача – написать метод
 * public void toLeft() {}
 * 1.Пройти с 1-ой до последней строки
 * 2.Пройти с 1-го до предпоследнего элемента
 * 3.В текущую ячейку поместить значение следующей
 * 4.Последнему элементу присвоить 0
 *
 * @version 1.0 21 July 2020
 * @author NII
 */
public class ArrayShift {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5, 6, 7},
                {8, 9, 10, 11, 12, 13, 14}
        };
        System.out.println("Исходный массив:");
        printArray(array);
        toLeft(array);
        System.out.println("Измененный массив:");
        printArray(array);
    }

    public static void toLeft(int [][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - 1; j++) {
                arr[i][j] = arr[i][j + 1];
                if (j == arr[i].length - 2 && i != arr.length - 1) {
                    arr[i][j + 1] = arr[i + 1][0];
                }
            }
        }
        arr[arr.length - 1][arr[arr.length - 1].length - 1] = 0;
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("{ ");
            for (int j = 0; j < arr[i].length; j++) {
                if (j != arr[i].length - 1) {
                    System.out.print(arr[i][j] + ", ");
                } else {
                    System.out.print(arr[i][j]);
                }
            }
            System.out.print(" }\n");
        }
    }
}
