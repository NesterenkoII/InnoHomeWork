package ru.nesterenko.part01.lesson02.task03;

/**
 * Класс реализует конветрацию минут в часы
 *
 * @version 1.0
 * @author  Igor Nesterenko
 */
public class Hour {
    final double secondNumber;

    Hour(final double sNumber) {
        secondNumber = sNumber;
    }

    final double getSecondNumber() {
        return secondNumber;
    }

    final double getHourNumber () {
        return (secondNumber / 3600);
    }
}