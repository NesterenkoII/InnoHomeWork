package ru.nesterenko.part01.lesson08.task01;

import java.util.Scanner;

/**
 * Класс реализует интерфейс работы калькулятора
 *
 * @version 1.0 21 June 2020
 * @author NII
 */
public class CalculatorMenu {

    private int choice;
    private double number1 = 0;
    private double number2 = 1;
    public static Scanner enterChoice = new Scanner(System.in);

    public static void showNumbersEntering(CalculatorMenu object) {

        System.out.println("\n------------------------------------");
        System.out.println("  Исходные данные для вычисления");
        System.out.println("------------------------------------");
        System.out.print("  Введите первое число - ");
        object.setNumber1(enterChoice.nextDouble());

        System.out.print("  Введите второе число - ");
        object.setNumber2(enterChoice.nextDouble());
        System.out.println("-----------------------------------");
    }

    public static int showMenuMath (CalculatorMenu object) {

        System.out.println("---------------------------------------------------------");
        System.out.println(" Выберите математическое действие над введенными числами");
        System.out.println("                и нажмите \"Enter\"");
        System.out.println("---------------------------------------------------------");
        System.out.println(" 1 - Вычитание");
        System.out.println(" 2 - Сложение");
        System.out.println(" 3 - Умножение");
        System.out.println(" 4 - Деление");
        System.out.println(" 5 - Процент от числа");
        System.out.println("---------------------------------------------------------");
        System.out.println(" 0 - Выход");
        System.out.println("---------------------------------------------------------");
        System.out.print("                   Ваш выбор - ");

        object.setChoice(enterChoice.nextInt());

        return object.getChoice();
    }

    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public int getChoice() {
        return choice;
    }
}
