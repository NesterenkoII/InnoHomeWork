package ru.nesterenko.part01.lesson03.task02;

import java.math.BigDecimal;
import java.util.Scanner;

public class SalaryDemo {
    public static void main(String[] args) {
        double tax;
        String salVal;

        Scanner enter = new Scanner(System.in);
        System.out.print("Введите размер заработной платы в рублях: ");
        salVal = enter.nextLine();

        System.out.print("Введите размер НДФЛ: ");
        tax = enter.nextDouble();

        enter.close();

        Salary John = new Salary(salVal);
        SalaryCalculate salary = new SalaryCalculate();

        System.out.println("Заработная плата Джона после вычета НДФЛ: "
                + salary.calculate(John.salary, tax) + " рублей");
    }
}


/**
 * Класс реализует объект с указанием размера заработной платы до вычета НДФЛ
 *
 * @author Igor Nesterenko
 * @version 2.0 08 June 2020
 */
class Salary {
    BigDecimal salary;

    Salary(String s) {
        salary = new BigDecimal(s);
    }
}


/**
 * Класс реализует расчет заработной платы по передаваемому значению ЗП до вычета НДФЛ и размера НДФЛ
 *
 * @author Igor Nesterenko
 * @version 2.0 08 June 2020
 */
class SalaryCalculate {

    BigDecimal calculate(BigDecimal sal, double t) {

        return sal.multiply(BigDecimal.valueOf(1 - t));
    }
}