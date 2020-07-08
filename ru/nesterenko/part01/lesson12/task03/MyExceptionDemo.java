package ru.nesterenko.part01.lesson12.task03;

/**
 * Заставить программу ”Hello, World!” упасть…
 * Вызвав свой вариант ошибки через оператор throw
 *
 * @version 1.0 7 July 2020
 * @author NII
 */
public class MyExceptionDemo {

    public static void main(String[] args) throws MyException {

        try {
            int number = 2 / 0;
        }
        catch (ArithmeticException exception) {
            throw new MyException("Деление на <0>");
        }
    }
}
