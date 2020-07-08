package ru.nesterenko.part01.lesson12.task03;

public class MyException extends ArithmeticException {

    public MyException() {
        super();
    }

    public MyException(String descry) {
        super(descry);
    }
}
