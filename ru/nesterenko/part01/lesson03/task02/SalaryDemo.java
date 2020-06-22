package ru.nesterenko.part01.lesson03.task02;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Написать программу, которая считает зарплату «на руки» (на вход программе передается величина зарплаты, на выходе
 * печатается зарплата за вычетом 13% (НДФЛ). Пример: на вход подается 70000, на выходе печатается 60900 руб.
 *
 * @version 2.0 13 June 2020
 * @author  Igor Nestrenko
 */
public class SalaryDemo {
    public static void main(String[] args) {
        Person linkPerson;
        linkPerson = ShowMenu.creationOfPerson();

        System.out.println("Имя - " + linkPerson.getName() + "\n" +
                "Возраст - " + linkPerson.getAge() + " лет" + "\n" +
                "Должность - " + linkPerson.getPosition() + "\n" +
                "Опыт работы - " + linkPerson.getWorkingExperience() + " лет" + "\n" +
                "З/П до вычета НДФЛ - " + linkPerson.getSalary() + " рублей" + "\n" +
                "З/П после вычета НДФЛ - " + FinanceCalculate.salaryFreeTax(linkPerson.getSalary()));

    }
}
