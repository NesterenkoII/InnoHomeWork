package ru.nesterenko.part01.lesson22.task01;

import java.util.ArrayList;
import java.util.List;

/**
 * Написать класс PersonSuperComparator, который реализует Comparator,
 * но умеет сравнивать по двум параметрам, возраст и имя.
 * Класс Person теперь содержит два поля int age и String name
 *
 * @version 1.0 11 August 2020
 * @author NII
 */
public class MainPersonCompare {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Ivan", 25));
        personList.add(new Person("Ivan", 21));
        personList.add(new Person("Ivan", 32));
        personList.add(new Person("Sergey", 87));
        personList.add(new Person("Sergey", 46));
        personList.add(new Person("Sergey", 15));
        personList.add(new Person("Andrey", 29));

        System.out.println("\nOriginal: ");
        for (Person person : personList) {
            System.out.println(person.toString());
        }
        personList.sort(new PersonSuperComparator());
        System.out.println("\nSorted: ");
        for (Person person : personList) {
            System.out.println(person.toString());
        }
    }
}
