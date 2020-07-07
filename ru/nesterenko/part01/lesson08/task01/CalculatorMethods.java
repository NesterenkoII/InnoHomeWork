package ru.nesterenko.part01.lesson08.task01;

public class CalculatorMethods {

    public static double summation(Double number1, Double number2) {
        return number1 + number2;
    }

    public static double subtraction(Double number1, Double number2) {
        return number1 - number2;
    }

    public static double multiplication(Double number1, Double number2) {
        return number1 * number2;
    }

    public static double division(Double number1, Double number2) {
        return number1 / number2;
    }

    public static double percentOfNumber(Double number1, Double percent) {
        return (number1 * percent / 100);
    }
}
