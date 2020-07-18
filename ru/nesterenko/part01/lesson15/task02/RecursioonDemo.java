package ru.nesterenko.part01.lesson15.task02;

import java.io.File;

import static ru.nesterenko.part01.lesson15.task02.RecursionLook.recursionLook;

public class RecursioonDemo {

    public static void main(String[] args) {
        String duringPath = "/Users/NII/Desktop/Development/src/ru/nesterenko/part01/";
        File file = new File(duringPath);
        System.out.println(file.getName() + "/");
        recursionLook(duringPath, 1);
    }
}
