package ru.nesterenko.part01.lesson04.task04;

import java.util.Scanner;

public class ProgressionDemo {
    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("Выберите пункт меню и нажмите \"Enter\":");
            System.out.println("1 - Задать параметры прогрессии");
            System.out.println("2 - Подсказки");
            System.out.println("0 - Выход");

            Scanner enter = new Scanner(System.in);
            choice = enter.nextInt();

            switch (choice) {
                case 1:
                    GeomProgression.showGeometricProgression();
                    break;
                case 2:
                    System.out.println("****\nВы можете вывести ариметическую или геометрическую прогрессию, задав" +
                                        " определенные параметры:");
                    System.out.println(" - Для вывода простой арифметоческой прогресии укажите нужный диапазон " +
                                        "от х1 до х2,\nстепень х равную 1, значение к = 1 и значение с = 0");
                    System.out.println(" - Для вывода простой геометрической прогресии укажите нужный диапазон " +
                                        "от х1 до х2,\nстепень х равную 1 или 2 (квадратичная зависимость) " +
                                        "значение к = 1 или к = 2 и значение с = 0\n****");
                    break;
                case 0:
                    System.out.println("Выход ...");
                    break;
                default:
                    break;
            }
        } while (choice != 0);



    }
}

/**
 * Класс реализует вывод на экран арифметическую или геометрическую прогрессию
 *
 * @version 1.0     9 June 2020
 * @author  Igor Nesterenko
 */
class GeomProgression {

    static void showGeometricProgression () {
        double i;
        int j;
        double x1;
        double x2;
        int n;
        double k;
        double c;
        double step;

        Scanner enter = new Scanner(System.in);
        System.out.println("Введите параметры для построения геометрической прогрессии y = x^n * k + c.");
        System.out.println("Диапазон х: от х1 до х2:");

        System.out.print("x = x1 = ");
        x1 = enter.nextDouble();

        System.out.print("xn = x2 = ");
        x2 = enter.nextDouble();

        System.out.print("Степень х = ");
        n = enter.nextInt();

        System.out.println("Парааметры k, c:");

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