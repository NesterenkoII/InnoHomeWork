package ru.nesterenko.part01.lesson04.task04;

import java.util.Scanner;

/**
 * Класс реализует вывод на экран арифметическую или геометрическую прогрессию
 *
 * @version 2.0 13 June 2020
 * @author  Igor Nesterenko
 */
class Progression {

    static void showProgression() {
        double i;
        int j;
        double x1;
        double x2;
        int n;
        double k;
        double c;
        double step;

        Scanner enter = new Scanner(System.in);
        System.out.println("Введите параметры для построения геометрической прогрессии Y = X^n * K + C.");
        System.out.println("Диапазон х: от х1 до х2:");

        System.out.print("X1 = ");
        x1 = enter.nextDouble();

        System.out.print("Xn = ");
        x2 = enter.nextDouble();

        System.out.print("Степень X = ");
        n = enter.nextInt();

        System.out.println("Парааметры K, C:");

        System.out.print("k = ");
        k = enter.nextDouble();

        System.out.print("c = ");
        c = enter.nextDouble();

        System.out.print("Шаг прогрессии: ");
        step = enter.nextDouble();

        for (i = x1; i <= x2; i += step) {
            x1 = i;

            if (n == 0) {
                x1 = 1;
            } else if (n > 1) {
                for (j = 1; j < n; j++ ) {
                    x1 *= i;
                }
            }
            System.out.print((x1 * k + c) + "    ");
        }
        System.out.println("\n");
    }
}
