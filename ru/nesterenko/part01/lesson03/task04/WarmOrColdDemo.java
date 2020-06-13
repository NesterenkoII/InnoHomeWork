package ru.nesterenko.part01.lesson03.task04;

import java.util.Random;
import java.util.Scanner;

/**
 * Игра «горячо-холодно»
 *
 * Создать консольное Java-приложение «Горячо-Холодно»
 *
 * Вначале программа «загадывает» случайное число от 1 до 100.
 * Пользователь вводит с консоли число.
 * Программа говорит пользователю «горячо», если он приблизился к «загаданному» числу и «холодно», И позволяет ввести число еще раз. если введенное число дальше от загаданного, чем предыдущее.
 * Для первого ввода пользователя считаем предыдущим введенным числом 0.
 * Предусмотреть возможность выхода из игры до отгадывания числа.
 *
 * @version 2.0 13 June 2020
 * @author  Igor Nesterenko
 */
public class WarmOrColdDemo {
    public static void main(String[] args) {

        Random rand = new Random();
        int randomNumber = 1 + rand.nextInt(99);
        int previousChoice = 0; //Число с которым сравнивается новый выбор
        int nextChoice;

        System.out.println(randomNumber); //Для контроля
        System.out.println("Загадано число от 1 до 100.");
        System.out.println("Попробуйте его угадать:");
        System.out.println("Введите число с клавиатуры и нажмите \"Enter\".");
        System.out.println("Для выхода введите \"0\" и нажмите \"Enter\".");

        do {
            Scanner enterInt = new Scanner(System.in);
            nextChoice = enterInt.nextInt();

            if (nextChoice == 0) {
                System.out.println("Выход");

                break;
            }

            if (nextChoice == randomNumber) {
                System.out.println("Вы победили!!!");
                enterInt.close();
                break;

            } else if (nextChoice > 100 || nextChoice < 0) {
                System.out.println("Вы вышли за диапазон от 1 до 100.");

            } else if (Math.abs(randomNumber - previousChoice) > Math.abs(randomNumber - nextChoice)) {
                previousChoice = nextChoice;
                System.out.println("Горячо!");

            } else {
                previousChoice = nextChoice;
                System.out.println("Холодно!");
            }
        } while (true);
    }
}
