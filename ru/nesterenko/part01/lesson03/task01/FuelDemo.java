package part01.lesson03.task01;

import java.util.Scanner;

public class FuelDemo {
    public static void main(String[] args) {
        double fuelValue;
        double fuelPrice;

        Scanner enter = new Scanner(System.in);
        System.out.print("Введите количество топлива в литрах: ");
        fuelValue = enter.nextDouble();

        System.out.print("введите стоимость одного литра: ");
        fuelPrice = enter.nextDouble();

        Fuel barl = new Fuel(fuelValue);
        Cost barlCost = new Cost();

        System.out.println("Стоимость " + fuelValue + " литров топива: "
                + barlCost.costCalculete(barl.value, fuelPrice) + " рублей");
    }
}


/**
 * Класс реализует объект заданного объема
 *
 * @author Igor Nesterenko
 * @version 2.0 08 June 2020
 */
class Fuel {
    double value;

    Fuel(double val) {
        value = val;
    }
}


/**
 * Класс реализует расчет стоимости топлава по объему и стоимоти толива
 *
 * @author Igor Nesterenko
 * @version 2.0 08 June 2020
 */
class Cost {

    double costCalculete(double v, double fP) {

        return (v * fP);
    }
}