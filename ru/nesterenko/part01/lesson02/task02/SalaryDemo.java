package ru.nesterenko.part01.lesson02.task02;

import java.math.BigDecimal;

/**
 * Написать программу, которая считает зарплату «на руки» (на вход программе передается величина зарплаты, на выходе
 * печатается зарплата за вычетом 13% (НДФЛ). Пример: на вход подается 70000, на выходе печатается 60900 руб.
 *
 * @version 13 June 2020
 * @author  Igor Nestrenko
 */
class SalaryDemo {
    public static void main(String[] args) {
        Person sam = new Person("Sam", "Engineer", 24,
                1, BigDecimal.valueOf(105234));

        System.out.println(sam.getName() + "'s salary free tax = "
                            + FinanceCalculate.salaryFreeTax(sam.getSalary(), 0.13));
    }
}
