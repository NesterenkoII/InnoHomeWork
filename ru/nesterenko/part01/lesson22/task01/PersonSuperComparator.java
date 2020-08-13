package ru.nesterenko.part01.lesson22.task01;

import java.util.Comparator;

public class PersonSuperComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int nameCompare = o1.getName().compareTo(o2.getName());
        int ageCompare = o1.getAge() - o2.getAge();

        if (nameCompare == 0) {
            return ageCompare;
        } else {
            return nameCompare;
        }
    }

}
