package ru.nesterenko.part01.lesson07.task01.VendingMachine;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс реализует вендинговый аппарат с напитками
 * методы выдачи напитков, проверки баланса и наличия напитков,
 * пополнения баланса
 *
 * @version 1.0 20 June 2020
 * @author  Igoe Nesterenko
 */
public class VendingMachine {

    private static double DEPOSIT = 0;
    public List<Drinks> drinksArray = new ArrayList<Drinks>();

    // Проверка наличия напитков в автомате
    void checkDrinkAbailability (Drinks drinkName) {

        if (drinkName.getCount() <= 0) {
            System.out.println("*** Напитки данной категории закончились! ***");
            return;
        }
    }

    // Проверка наличия денег на балансе
    void checkMoneyAvailability(Drinks drinkName) {

        if (DEPOSIT < drinkName.getPrice()) {
            System.out.println("*** Недостаточно средств. Пополните баланс! ***");
            return;
        }
    }

    // Метод осуществляет выдачу напитка,
    public void giveDrink(Drinks drinkName) {

        checkDrinkAbailability(drinkName);
        checkMoneyAvailability(drinkName);

        if (drinkName == Drinks.FANTA && drinkName.getPrice() <= DEPOSIT && drinkName.getCount() > 0) {
            System.out.println("Выдан напиток: " + drinkName.name());
            DEPOSIT -= drinkName.getPrice();
            drinkName.decrementCount();
            return;
        }

        if (drinkName == Drinks.COCA_COLA && drinkName.getPrice() <= DEPOSIT && drinkName.getCount() > 0) {
            System.out.println("Выдан напиток: " + drinkName.name());
            DEPOSIT -= drinkName.getPrice();
            drinkName.decrementCount();
            return;
        }

        if (drinkName == Drinks.SPRIT && drinkName.getPrice() <= DEPOSIT && drinkName.getCount() > 0) {
            System.out.println("Выдан напиток: " + drinkName.name());
            DEPOSIT -= drinkName.getPrice();
            drinkName.decrementCount();
            return;
        }
        return;
    }

    // Для удобного добавление напитков в аппарат
    public void addDrink(Drinks drinkName, int countOfDrinks) {
        if (drinkName == Drinks.FANTA) {
            for (int i = 0; i < countOfDrinks; i++) {
                drinkName.incrementCount();
            }
        }

        if (drinkName == Drinks.COCA_COLA) {
            for (int i = 0; i < countOfDrinks; i++) {
                drinkName.incrementCount();
            }
        }

        if (drinkName == Drinks.SPRIT) {
            for (int i = 0; i < countOfDrinks; i++) {
                drinkName.incrementCount();
            }
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

    // Метод возвращает общее колическво напитков в аппарате
    // Использовался для отладки программы
    public int getDrinksTotalCount(Drinks drinkName) {
        return (drinkName.FANTA.getCount() + drinkName.COCA_COLA.getCount() + drinkName.SPRIT.getCount());
    }
}
