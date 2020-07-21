package ru.nesterenko.part01.lesson21.task01;

public class ArrayShift {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5, 6, 7},
                {8, 9, 10, 11, 12, 13, 14}
        };
        System.out.println("Исходный массив:");
        printArray(array);
        arrayShift(array);
        System.out.println("Измененный массив:");
        printArray(array);
    }

    public static void arrayShift(int [][] arr) {
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
