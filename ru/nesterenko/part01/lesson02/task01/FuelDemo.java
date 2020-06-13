package ru.nesterenko.part01.lesson02.task01;

/**
 *Написать программу, которая считает стоимость бензина (на вход программе передается кол-во литров, на выходе печатается
 * стоимость). Пример: стоимость литра бензина 43 рубля. На вход подается 50, на выходе должно быть 2150 руб.
 *
 * @version 1.0 13 June 2020
 * @author  Igor Nesterenko
 */
public class FuelDemo {
    public static void main(String[] args) {
        Fuel barrel = new Fuel("Barrel", 40, 33.70);

        System.out.println(barrel.getTypeOfContainer() + " c " + barrel.getFuelValue() + " литрами бензина стоит "
                + CalculateCostOfGoods.calculateFuelCost(barrel.getFuelValue(), barrel.getFuelPrice()) + " рублей");
    }
}
