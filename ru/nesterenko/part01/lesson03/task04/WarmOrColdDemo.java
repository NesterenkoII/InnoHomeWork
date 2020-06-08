package part01.lesson03.task04;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class WarmOrColdDemo {
    public static void main(String[] args) {

        Random rand = new Random();
        int randNum = 1 + rand.nextInt(99);
        int initNum = 0;
        int nextNum;

        System.out.println(randNum); //Для контроля
        System.out.println("Загадано число от 1 до 100.");
        System.out.println("Попробуйте его угадать:");
        System.out.println("Введите число с клавиатуры и нажмите \"Enter\".");
        System.out.println("Для выхода введите \"0\" и нажмите \"Enter\".");

        do {
            Scanner in = new Scanner(System.in);
            nextNum = in.nextInt();

            if (nextNum == 0) {

                System.out.println("Выход");

                break;
            }

            if (nextNum == randNum) {

                System.out.println("Вы победили!!!");

                in.close();

                break;

            } else if (nextNum > 100 || nextNum < 0) {

                System.out.println("Вы вышли за диапазон от 1 до 100.");

            } else if (Math.abs(randNum - initNum) > Math.abs(randNum - nextNum)) {

                initNum = nextNum;

                System.out.println("Горячо!");

            } else {

                initNum = nextNum;

                System.out.println("Холодно!");
            }
        } while (true);
    }
}
