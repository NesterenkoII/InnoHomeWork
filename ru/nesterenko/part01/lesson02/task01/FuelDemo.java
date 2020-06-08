package ru.nesterenko.part01.lesson02.task01;

public class FuelDemo {
    public static void main(String[] args) {
        double fuelValue, h = 55.9;
        int[] a = new int[3];
        String s = "999";
        s = h.toString();

        fuelValue = 40;
        Fuel fP = new Fuel(3);

        System.out.println("Стоимость " + fuelValue + " литров бензина: "
                + fP.calculateCost(fuelValue) + " рублей");
    }
}
