package ru.nesterenko.part01.lesson13.task01;

public class ChildDontLikeFoodException extends Exception{

    public ChildDontLikeFoodException() {

    }

    public ChildDontLikeFoodException(String message) {
        super(message);
    }
}
