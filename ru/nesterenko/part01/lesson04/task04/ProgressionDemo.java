package ru.nesterenko.part01.lesson04.task04;

import java.util.Scanner;

/**
 * Написать программу, которая выводит арифметическую или геометрическую прогрессию для N чисел.
 *
 * @version 2.0 13 June 2020
 * @author  Igor Nesterenko
 */
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
                    Progression.showProgression();
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
                    System.out.println("Выбран несуществующий пункт меню.\n");
            }
        } while (choice != 0);



    }
}
