package ru.nesterenko.part01.lesson03.task03;

import java.util.Scanner;

/**
 * Написать программу, которая конвертирует секунды в часы.
 * Пример: на вход подается 3600, на выходе печатается 1 час.
 *
 * @version 3.0 13 June 2020
 * @author  Igor Nesterenko
 */
public class SecondDemo {
    public static void main(String[] args) {
        Second step = new Second();

        Scanner enterDouble = new Scanner(System.in);
        System.out.println("Введите количество секунд для конвертации в часы:");
        step.setSecondNumber(enterDouble.nextDouble());

        System.out.println("В " + step.getSecondNumber() + " секундах " +
                SecondConvert.convertToHour(step.getSecondNumber()));
    }
}
