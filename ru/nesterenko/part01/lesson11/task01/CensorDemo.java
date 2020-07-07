package ru.nesterenko.part01.lesson11.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Напишите программу которая запрашивает у пользователя строку.
 * Затем программа должна заменить в строке все вхождения слова «бяка»
 * (буквы могут быть в любом регистре) на «вырезано цензурой» и вывести
 * результат обратно в консоль. Если «бяка» является частью слова, то такое
 * вхождение нужно оставить без изменений. Например, слово «кулебяка» должно
 * остаться без изменений.
 *
 * @version 1.0 7 July 2020
 * @author NII 
 */
public class CensorDemo {

    public static void main(String[] args) throws IOException {

        String text;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Исходный текст: ");
        text = reader.readLine();

        System.out.printf("Исправленный текст: %s\n"
                , text.replaceAll("\\b[Бб][Яя][Кк][Аа]\\b","<Вырезано цензурой>"));
    }
}
