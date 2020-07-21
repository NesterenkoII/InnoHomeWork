package ru.nesterenko.part01.lesson21.task02;

/**
 *
 *
 * @version 1.0 20 Jule 2020
 * @author NII
 */
public class ArrayReverse {
    public static void main(String[] args) {
        int[] array = {1,4,2,9,9,6,1};
        System.out.println("Исходный массив:");
        printArray(array);
        arrayReverse(array);
        System.out.println("Массив после перестановки:");
        printArray(array);
    }

    public static void printArray(int[] arr) {
        for (int i: arr) {
            System.out.print(i + ", ");
        }
        System.out.println("\n");
    }

    public static void arrayReverse(int[] arr) {
        int swap;
        for (int i = 0; i < arr.length / 2; i++) {
            swap = arr[i];
            arr[i] = arr[arr.length - (i + 1)];
            arr[arr.length - (i + 1)] = swap;
        }
    }
}
