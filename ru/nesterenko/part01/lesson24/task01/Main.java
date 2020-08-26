package ru.nesterenko.part01.lesson24.task01;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Написать метод, который возвращает множество, в котором удалены все элементы четной длины из исходного множества.
 * public Set<String> removeEvenLength(Set<String> set);
 * Например, для множества ["foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"]
 * метод вернет ["foo", "bar", "spoon", "!"]
 *
 * @version 1.0 24 August 2020
 * @author  NII
 */
public class Main {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();

        set.add("foo");
        set.add("buzz");
        set.add("bar");
        set.add("fork");
        set.add("bort");
        set.add("spoon");
        set.add("!");
        set.add("dude");

        System.out.println("\nOriginal set:");
        printSet(set);
        System.out.println("\nSet after remove:");
        printSet(removeEvenLength(set));
    }

    public static Set<String> removeEvenLength(Set<String> set) {
        set.removeIf(o -> o.length() % 2 == 0);
        return set;
    }

    public static void printSet(Set<String> set) {
        for (String s : set) {
            System.out.println(s + " - " + s.length());
        }
    }
}
