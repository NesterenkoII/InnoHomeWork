package ru.nesterenko.part01.lesson02.task03;

/**
 * Класс реализует конветрацию минут в часы
 *
 * @version 13 June 2020
 * @author  Igor Nesterenko
 */
public class Hour {
    final double secondNumber;

    Hour(final double secondNumber) {
        this.secondNumber = secondNumber;
    }

    final double getSecondNumber() {
        return secondNumber;
    }

    final String getHourNumber () {
        return ((int) (secondNumber) / 3600) + " ч. "
                + ((secondNumber % 3600) / 60) + " мин.";
    }
}