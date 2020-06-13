package ru.nesterenko.part01.lesson03.task01;

/**
 * Класс реализует вычисление стоимости бензина при указании его объема
 *
 * @version 13 June 2020
 * @author  Igor Nesterenko
 */
public class Fuel {
    private final String container;
    private double value = 0;
    private double price = 0;

    Fuel(String typeOfContainer) {
        container = typeOfContainer;
    }

    Fuel(String typeOfContainer, double fuelValue, double fuelPrice) {
        container = typeOfContainer;
        this.value = fuelValue;
        this.price = fuelPrice;
    }

    void setFuelValue(double fuelValue) {
        value = fuelValue;
    }

    double getFuelValue() {
        return value;
    }

    void setFuelPrice(double fuelPrice) {
        price  = fuelPrice;
    }

    double getFuelPrice() {
        return price;
    }

    String getTypeOfContainer() {
        return container;
    }
}
