package ru.nesterenko.part01.lesson04.task01;

import java.util.Scanner;

public class MinNumer {
    public static void main(String[] args) {
        double num1;
        double num2;

        Scanner enter = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        num1 = enter.nextDouble();

        System.out.print("Введите второе число: ");
        num2 = enter.nextDouble();

        enter.close();

        if (num1 < num2) {
            System.out.println(num1 + " - минимальное число");
        } else if (num1 > num2) {
            System.out.println(num2 + " - минимальное число");
        } else if (num1 == num2) {
            System.out.println("Числа равны");
        }
    }
}
