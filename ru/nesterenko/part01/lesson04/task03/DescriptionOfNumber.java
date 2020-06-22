package ru.nesterenko.part01.lesson04.task03;

class DescriptionOfNumber {

    static String oddNumber(double num) {
        if (((num * 10) % 10) != 0) {
            return "Ни четное, ни нечетное";
        }

        if ((num % 2) == 0) {
            return num + " - четное";
        } else {
            return num + " - нечетное";
        }
    }

    static String wholeNumber(double num) {
        if (((num * 10) % 10) != 0) {
            return num + " - дробное";
        } else return num + " - целое";
    }

    static String positiveNumber(double num) {
        if (num > 0) {
            return num + " - положительное";
        } else if (num < 0) {
            return num + " - отрицательное";
        } else {
            return num + " - нулевOе или даже нулЕвое =)";
        }

    }

    static String fullDescriptionOfNumber(double num) {
        return oddNumber(num) + "\n" + wholeNumber(num) + "\n" + positiveNumber(num);
    }
}
