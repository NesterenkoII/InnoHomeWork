package ru.nesterenko.part01.lesson04.task01;

import java.util.Scanner;

public class NumberCompare {
    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner enter = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        num1 = enter.nextInt();

        System.out.print("Введите второе число: ");
        num2 = enter.nextInt();

        enter.close();

        if (num1 < num2) {
            System.out.println(num1 + " < " + num2);
        } else if (num1 > num2) {
            System.out.println(num1 + " > " + num2);
        } else if (num1 == num2) {
            System.out.println(num1 + " = " + num2);
        }
    }
}
