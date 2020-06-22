package ru.nesterenko.part01.lesson03.task01;

import java.util.Scanner;

/**
 *Написать программу, которая считает стоимость бензина (на вход программе передается кол-во литров, на выходе печатается
 * стоимость). Пример: стоимость литра бензина 43 рубля. На вход подается 50, на выходе должно быть 2150 руб.
 *
 * @version 2.0 13 June 2020
 * @author  Igor Nesterenko
 */
public class FuelDemo {
    public static void main(String[] args) {
        Fuel barrel = new Fuel("barrel");

        Scanner enter = new Scanner(System.in);
        System.out.print("Введите количество топлива в литрах: ");
        barrel.setFuelValue(enter.nextDouble());

        System.out.print("введите стоимость одного литра: ");
        barrel.setFuelPrice(enter.nextDouble());

        enter.close();

        System.out.println("Стоимость " + barrel.getFuelValue() + " литров топива: "
                + CalculateCostOfGoods.calculateFuelCost(barrel.getFuelValue(), barrel.getFuelPrice()) + " рублей");
    }
}
