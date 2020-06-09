package ru.nesterenko.part01.lesson04.task03;

import java.util.Scanner;

public class DescriptionNumberDemo {
    public static void main(String[] args) {
        double number;
        int choice;


        Scanner enter = new Scanner(System.in);
        System.out.println("Oписания числа");
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
                    System.out.println(DescriptinNumber.oddNumber(number));
                    System.out.println();
                    break;
                case 2:
                    System.out.println(DescriptinNumber.wholeNumber(number));
                    System.out.println();
                    break;
                case 3:
                    System.out.println(DescriptinNumber.positiveNumber(number));
                    System.out.println();
                    break;
                case 4:
                    System.out.println(DescriptinNumber.fullDescriptionOfNumber(number));
                    System.out.println();
                    break;
                default:
                    System.out.println("Выход ...");
                    System.out.println();
                    choice = 0;
            }
        } while (choice != 0);
    }
}


class DescriptinNumber {

    static String oddNumber(double num) {
        if (((num * 10) % 10) != 0) {
            return "Ни четное, ни нечетное";
        }

        if ((num % 2) == 0) {
            return num + " - четное";
        } else {
            return num + " - нечетное";
        }
    }

    static String wholeNumber(double num) {
        if (((num * 10) % 10) != 0) {
            return num + " - дробное";
        } else return num + " - целое";
    }

    static String positiveNumber(double num) {
        if (num > 0) {
            return num + " - положительное";
        } else if (num < 0) {
            return num + " - отрицательное";
        } else {
            return num + " - нулевOе или даже нулЕвое =)";
        }

    }

    static String fullDescriptionOfNumber(double num) {
        return oddNumber(num) + "\n" + wholeNumber(num) + "\n" + positiveNumber(num);
    }
}