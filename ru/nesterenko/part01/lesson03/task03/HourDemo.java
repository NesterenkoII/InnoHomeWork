package part01.lesson03.task03;

import java.util.Scanner;

public class HourDemo {
    public static void main(String[] args) {
        int secondNum;

        Scanner enter = new Scanner(System.in);

        System.out.print("Введите количество секунд: ");
        secondNum = enter.nextInt();

        Second step = new Second(secondNum);
        SecondConvert secondConvert = new SecondConvert();

        System.out.println(step.number + " секунд составляет " + secondConvert.secondToHour(step.number) + " часов");
    }
}


/**
 * Класс реализует объект с количеством секунд
 *
 * @version     2.0 08 June 2020
 * @author      Igor Nesterenko
 */
class Second {
    double number;

    Second(double s) {
        number = s;
    }
}


/**
 * Класс осуществляет конвертацию секунд в часы
 *
 * @version     2.0 08 June 2020
 * @author      Igor Nesterenko
 */
class SecondConvert {

    double secondToHour(double sN) {

        return (sN / 3600);
    }
}