package ru.nesterenko.part01.lesson25.task01;

import java.util.*;

/**
 * public boolean isUnique(Map<String, String> map);
 * Написать метод, который возвращает true, если в мапе нет двух и более одинаковых value, и false в противном случае.
 * Для пустой мапы метод возвращает true.
 * Например, для метода {Вася=Иванов, Петр=Петров, Виктор=Сидоров, Сергей=Савельев, Вадим=Викторов} метод вернет true,
 * а для {Вася=Иванов, Петр=Петров, Виктор=Иванов, Сергей=Савельев, Вадим=Петров} метод вернет false.
 *
 * @version 1.0 27 August 2020
 * @author NII
 */
public class Main {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("Вася","Иванов");
        map.put("Петр","Петров");
        map.put("Виктор","Иванов");
        map.put("Сергей","Савельев");
        map.put("Вадим","Петров");
        System.out.println("\nFirst map isUnique <"+ isUnique(map) + ">");
        printMap(map);

        map.put("Вася","Иванов");
        map.put("Петр","Петров");
        map.put("Виктор","Сидоров");
        map.put("Сергей","Савельев");
        map.put("Вадим","Викторов");
        System.out.println("\nSecond map isUnique <"+ isUnique(map) + ">");
        printMap(map);
    }

    public static void printMap(Map<String, String> map) {
        for (Map.Entry<String, String> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " = " + pair.getValue());
        }
    }

    public static boolean isUnique(Map<String, String> map) throws NullPointerException{
        Map<String, String> treeMap = new TreeMap<>();
        treeMap = map;
        boolean result = true;
        String prevValue = null;
        for (Map.Entry<String, String> curentValue : treeMap.entrySet()) {
            if (Objects.equals(prevValue, curentValue.getValue())) {
                result = false;
            }
            prevValue = curentValue.getValue();
        }
        return result;
        }
}
