package ru.nesterenko.part01.lesson08.lecture.task02;

public class ClassWithCounter {

    private String name;
    private static int counter = 0;

    public ClassWithCounter(String nameOfNewClass) {

        this.name = nameOfNewClass;
        counter++;
    }

    public String getName() {
        return name;
    }

    public int getCounter() {
        return counter;
    }
}
