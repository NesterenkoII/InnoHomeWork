package ru.nesterenko.part01.lesson03.task03;

/**
 * Класс реализует конвертацию секунд в часы
 *
 * @version 2.0 13 June 2020
 * @author  Igor Nesterenko
 */
class SecondConvert {

    public static String convertToHour (Double secondNumber) {
        return ((int) ((secondNumber) / 3600)) + " ч. "
                + ((secondNumber % 3600) / 60) + " мин.";
    }
}
