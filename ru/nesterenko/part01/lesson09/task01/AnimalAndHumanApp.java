package ru.nesterenko.part01.lesson09.task01;

import ru.nesterenko.part01.lesson09.task01.Animals.Bear;
import ru.nesterenko.part01.lesson09.task01.Animals.Duck;
import ru.nesterenko.part01.lesson09.task01.Humans.OldHuman;
import ru.nesterenko.part01.lesson09.task01.Humans.YoungHuman;

/**
 * 1.Написать абстрактный класс Animal с абстрактным методом getName.
 * Сделать несколько классов животных, наследников Animal.
 * Метод getName должен выводит название каждого животного.
 *
 * 2.Написать интерфейсы Fly, Run и Swim чтобы в каждом было по одному методу.
 * Добавить классам животных из предыдущего задания имплементацию этих интерфейсов.
 * Некоторые животные могут реализовать больше одного интерфейса (утка может и плавать, и летать и бегать).
 *
 * 3.Написать абстрактный класс Человек реализующий интерфейсы «бежать» и «плавать» (в каждом сделать 1-2 метода).
 * Сделать несколько наследников этого класса с конкретной реализацией методов, которые объявлены в интерфейсах.
 *
 * @version 1.0 06 Jule
 * @author NII
 */
public class AnimalAndHumanApp {
    public static void main(String[] args) {

        // Животные
        Bear bear = new Bear("Медведь");
        Duck bird = new Duck("Утка");

        System.out.println(bear.getName() + " " + bear.getName());
        System.out.println(bird.getName() + " " + bird.getName());

        System.out.println(bear.getName() + " " + bear.run());
        System.out.println(bird.getName() + " " + bird.run());

        System.out.println(bear.getName() + " " + bear.swim());
        System.out.println(bird.getName() + " " + bird.swim());

        System.out.println(bird.getName() + " " + bird.fly());

        // Люди
        OldHuman grandfather = new OldHuman();
        YoungHuman child = new YoungHuman();

        System.out.println(grandfather.getClass() + " " + grandfather.jump());
        System.out.println(child.getClass() + " " + child.jump());

        System.out.println(grandfather.getClass() + " " + grandfather.run());
        System.out.println(child.getClass() + " " + child.run());

        System.out.println(grandfather.getClass() + " " + grandfather.swim());
        System.out.println(child.getClass() + " " + child.swim());
    }
}
