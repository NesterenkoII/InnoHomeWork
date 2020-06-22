package ru.nesterenko.part01.lesson04.task03;

import java.util.Scanner;

/**
 * Написать программу, которая описывает введенное число.
 * Отрицательное оно число или положительное (или нулевое), чётное или нечётное.
 *
 * @version 2.0 13 June 2020
 * @author
 */
public class DescriptionNumberDemo {
    public static void main(String[] args) {
        double number;
        int choice;


        Scanner enter = new Scanner(System.in);
        System.out.println("Описание числа");
        System.out.print("Введите число: ");
        number = enter.nextDouble();

        System.out.println("Выбрано число: " + number);
        System.out.println();

        do {
            System.out.println("Методы описания числа.");
            System.out.println("Введите номер пункта и нажмите \"Enter\"");
            System.out.println("1 - Четное или нечетное");
            System.out.println("2 - Дробное или целое");
            System.out.println("3 - Положительное или отрицательное");
            System.out.println("4 - Вывести всю доступную информацию о числе");
            System.out.println("0 - Выход");

            choice = enter.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(DescriptionOfNumber.oddNumber(number));
                    System.out.println();
                    break;
                case 2:
                    System.out.println(DescriptionOfNumber.wholeNumber(number));
                    System.out.println();
                    break;
                case 3:
                    System.out.println(DescriptionOfNumber.positiveNumber(number));
                    System.out.println();
                    break;
                case 4:
                    System.out.println(DescriptionOfNumber.fullDescriptionOfNumber(number));
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Выход ...");
                    System.out.println();
                    choice = 0;
                    break;
                default:
                    System.out.println("Выбранного пункта нет в меню!\n");
            }
        } while (choice != 0);
    }
}