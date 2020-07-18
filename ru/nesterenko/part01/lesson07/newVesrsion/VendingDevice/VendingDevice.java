package ru.nesterenko.part01.lesson07.newVesrsion.VendingDevice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс реализует вендинговый аппарат с напитками
 * методы выдачи напитков, проверки баланса и наличия напитков,
 * пополнения баланса.
 *
 * @version 3.1 22 June 2020
 * @author  Igor Nesterenko
 */
public class VendingDevice {

    private static final Logger log = LogManager.getLogger(VendingDevice.class.getName());

    private static double deposit = 0;
    private final List<Drink> drinksList;

    public VendingDevice() {
        drinksList = new ArrayList<>();
    }

    public List<Drink> getDrinksList() {
        return drinksList;
    }

    public boolean isDrinkAvailability(Drink drink) {
        return drink.getCount() > 0;
    }

    public boolean isMoneyAvailability(Drink drink) {
        return deposit >= drink.getPrice();
    }

    public void addDrink(Drink drink, int countOfDrinks) {
        drink.setCount(countOfDrinks);
        drinksList.add(drink);
    }

    public void giveDrink(Drink drink) {
        if (!isDrinkAvailability(drink)) {
            log.warn("<Напитки данной категории закончились>");
        } else if (!isMoneyAvailability(drink)) {
            System.out.println("*** Недостаточно средств. Пополните баланс! ***");
        } else {
            log.info("<Напиток выдан>");
            deposit -= drink.getPrice();
            drink.setCount(drink.getCount() - 1);
        }
    }

    public void addMoney(double moneyCount) {
        if (!(moneyCount < 0)) {
            deposit += moneyCount;
            log.info("<Депозит пополнен>");
        } else {
            log.error("<Некорректный ввод>");
        }
    }

    public double getDeposit() {
        return deposit;
    }
}
