package ru.nesterenko.part01.lesson02.task01;

/**
 * Класс реализует вычисление стоимости бензина при указании его объема
 *
 * @version 1.0
 * @author  Igor Nesterenko
 */
public class Fuel {
    final double fuelPrice;

    Fuel(final double fPrice) {
        fuelPrice = fPrice;
    }

    final public double calculateCost(final double fValue) {
        return (fValue * fuelPrice);
    }
}
