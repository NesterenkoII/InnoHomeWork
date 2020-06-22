package ru.nesterenko.part01.lesson08.task02;


/**
 * Реализовать класс в конструкторе которого будет счетчик количества создаваемых объектов.
 * Написать метод для получения информации о количестве.
 *
 * @version 1.0 21 June 2020
 * @author  Igor Nesterenko
 */
public class Main {
    public static void main(String[] args) {

        ClassWithCounter object1 = new ClassWithCounter("Object1");
        ClassWithCounter object2 = new ClassWithCounter("Object2");
        ClassWithCounter object3 = new ClassWithCounter("Object2");

        System.out.println("Количество объектов класса: " + object1.getCounter());
    }
}
