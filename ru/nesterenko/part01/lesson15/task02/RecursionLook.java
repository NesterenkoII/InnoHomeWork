package ru.nesterenko.part01.lesson15.task02;

import java.io.File;

public class RecursionLook {
    public static int depth = 0;

    public static void recursionLook(String pathSource, int depth) {
        File dir = new File(pathSource);

        for (File temp: dir.listFiles()) {
            if (temp.isDirectory()) {
                for (int i = 0; i <= depth; i++) {
                    System.out.print(" ");
                }
                System.out.println(temp.getName() + "/");
                recursionLook(temp.getAbsolutePath(), depth + 2);
            } else {
                for (int i = 0; i <= depth; i++) {
                    System.out.print(" ");
                }
                System.out.println(temp.getName());
            }
        }
    }
}
