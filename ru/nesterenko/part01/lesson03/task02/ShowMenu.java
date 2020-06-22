package ru.nesterenko.part01.lesson03.task02;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *  Класс осуществляет вывод меню для заполнения карточки нового сотрудника и позволяет заполнить карточку
 *  вводом информации с клавиатуры
 *
 * @version 2.0 13 June 2020
 * @author  Igor Nesterenko
 */
public class ShowMenu {

    public static Person creationOfPerson(){
        Person newPerson = new Person();

        Scanner enterInt = new Scanner(System.in);
        int choiceInteger;

        do {
            System.out.println("Меню создания карточки нового сторудника:");
            System.out.println("Введите номер пункта и нажмите \"Enter\"");
            System.out.println("1 - Создать нового сотрудника");
            System.out.println("0 - Выход");

            choiceInteger = enterInt.nextInt();

            switch (choiceInteger) {
                case 1:
                    System.out.println("введите данные сотрудника:");
                    ShowMenu.setPersonName(newPerson);
                    ShowMenu.setPersonAge(newPerson);
                    ShowMenu.setPersonPosition(newPerson);
                    ShowMenu.setPersonSalary(newPerson);
                    ShowMenu.setPersonWorkingExperience(newPerson);
                    break;
                case 0:
                    System.out.println("Выход ...");
                    System.out.println();
                    return newPerson;
                default:
                    System.out.println("Введено некорректное значение!");
                    System.out.println();
            }
        } while (choiceInteger != 0);
        return newPerson;
    }

    public static void setPersonName(Person link) {

        Scanner enterString = new Scanner(System.in);
        System.out.print("Имя - ");

        link.setName(enterString.nextLine());
    }

    public static void setPersonSalary(Person link) {

        Scanner enterString = new Scanner(System.in);
        System.out.print("Размер заработной платы - ");

        link.setSalary(BigDecimal.valueOf(enterString.nextDouble()));
    }

    public static void setPersonAge(Person link) {

        Scanner enterInt = new Scanner(System.in);
        System.out.print("Возраст - ");

        link.setAge(enterInt.nextInt());
    }

    public static void setPersonWorkingExperience(Person link) {

        Scanner enterInt = new Scanner(System.in);
        System.out.print("Стаж работы - ");

        link.setWorkingExperience(enterInt.nextInt());
    }

    public static void setPersonPosition(Person link) {

        Scanner enterString = new Scanner(System.in);
        System.out.print("Наименование должности - ");

        link.setPosition(enterString.nextLine());
    }
}
