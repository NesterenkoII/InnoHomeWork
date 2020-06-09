package ru.nesterenko.part01.lesson02.task01;

public class FuelDemo {
    public static void main(String[] args) {
        double fuelValue;

        fuelValue = 40;
        Fuel fP = new Fuel(3);

        System.out.println("Стоимость " + fuelValue + " литров бензина: "
                + fP.calculateCost(fuelValue) + " рублей");
    }
}
