package ru.nesterenko.part01.lesson12.task03;

public class MyException extends ArithmeticException {

    public String getError() {
        return "Делить на <0> нельзя";
    }
}
