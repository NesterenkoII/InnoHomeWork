package ru.nesterenko.part01.lesson03.task03;

/**
 * Класс реализует объект с количеством секунд
 *
 * @version     2.0 08 June 2020
 * @author      Igor Nesterenko
 */
class Second {
    double secondNumber;

    Second(double s) {
        secondNumber = s;
    }

    Second() {

    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }
}