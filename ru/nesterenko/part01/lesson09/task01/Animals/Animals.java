package ru.nesterenko.part01.lesson09.task01.Animals;

abstract class Animals {

    String name;

    Animals(String name) {
        this.name = name;
    }

    public abstract String getName();
}
