package ru.nesterenko.part01.lesson02.task03;

/**
 * Написать программу, которая конвертирует секунды в часы. Пример: на вход подается 3600, на выходе печатается 1 час.
 *
 * @version 13 June 2020
 * @author  Igor Nesterenko
 */
public class HourDemo {
    public static void main(String[] args) {
        Hour secN = new Hour(3600 + 1200);

        System.out.println("В " + secN.getSecondNumber() + " секундах "
                            + secN.getHourNumber());
    }
}
