package ru.nesterenko.part01.lesson06.task01.transport;

public class Truck extends Transport {

    private double trailerValue;
    private double maxWeight;
    private double oneKmUsingCost;

    public Truck(String carBrand, String carModel, int yearOfManufacture,
                    int operatingTime, double fuelConsumption, double trailerValue,
            double maxWeight, double oneKmUsingCost) {
            super(carBrand, carModel, yearOfManufacture,
                    operatingTime, fuelConsumption);

            this.trailerValue = trailerValue;
            this.maxWeight = maxWeight;
            this.oneKmUsingCost = oneKmUsingCost;
    }

    public double getCargoDeliverPrice(double distance) {
        return distance * oneKmUsingCost;
    }
}
