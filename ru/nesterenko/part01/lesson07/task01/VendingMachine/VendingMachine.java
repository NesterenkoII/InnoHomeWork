package ru.nesterenko.part01.lesson07.task01.VendingMachine;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс реализует вендинговый аппарат с напитками
 * методы выдачи напитков, проверки баланса и наличия напитков,
 * пополнения баланса.
 *
 * @version 3.0 22 June 2020
 * @author  Igoe Nesterenko
 */
public class VendingMachine {

    private static double DEPOSIT = 0;
    private final List<Drinks> drinksList;

    public VendingMachine() {
        drinksList = new ArrayList<Drinks>();
        drinksList.add(0,Drinks.FANTA);
        drinksList.add(1,Drinks.SPRIT);
        drinksList.add(2,Drinks.JUICE);
        drinksList.add(3,Drinks.PEPSI);
        drinksList.add(4,Drinks.WATER);
    }

    public void initVendingMachine(VendingMachine vendingMachine,
                                   int fanta, int sprit, int juice, int pepsi, int water) {
        vendingMachine.addDrink(vendingMachine.getDrinksList().get(0),9);
        vendingMachine.addDrink(vendingMachine.getDrinksList().get(1),5);
        vendingMachine.addDrink(vendingMachine.getDrinksList().get(2),1);
        vendingMachine.addDrink(vendingMachine.getDrinksList().get(3),0);
        vendingMachine.addDrink(vendingMachine.getDrinksList().get(4),7);
    }

    public List<Drinks> getDrinksList() {
        return drinksList;
    }

    // Проверка наличия напитков в автомате
    public void checkDrinkAvailability(Drinks drinkName) {

        if (drinkName.getCount() <= 0) {
            System.out.println("*** Напитки данной категории закончились! ***");
        }
    }

    // Проверка наличия денег на балансе
    public void checkMoneyAvailability(Drinks drinkName) {

        if (DEPOSIT < drinkName.getPrice()) {
            System.out.println("*** Недостаточно средств. Пополните баланс! ***");
        }
    }

    // Для удобного добавление напитков в аппарат
    public void addDrink(Drinks drinkName, int countOfDrinks) {
        drinkName.setCount(countOfDrinks);
    }

    // Метод осуществляет выдачу напитка,
    public void giveDrink(Drinks drinkName) {

        checkMoneyAvailability(drinkName);
        checkDrinkAvailability(drinkName);

        if (drinkName.getPrice() <= DEPOSIT && drinkName.getCount() > 0) {
            System.out.println("Выдан напиток: " + drinkName.name());
            DEPOSIT -= drinkName.getPrice();
            drinkName.setCount(drinkName.getCount() - 1);
        }
    }

    // Метод вносит деньги на баланс
    public void insertMoney(double moneyCount) {
        DEPOSIT += moneyCount;
    }

    // Метод возвращает значение баланса
    public double getDEPOSIT() {
        return DEPOSIT;
    }
}
