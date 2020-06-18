package ru.nesterenko.part01.lesson06.task01.transport;

/**
 * Класс реализует описывает общие кахактеристики транспортных средств
 *
 * @version 1.0 18 June 2020
 * @author  Igor Nesterenko
 */
public class Transport {

    private String carBrand;
    private String carModel;

    private int yearOfManufacture;
    private int operatingTime;

    private double fuelConsumption;

    public Transport(String carBrand, String carModel, int yearOfManufacture,
              int operatingTime, double fuelConsumption) {

        this.carBrand = carBrand;
        this.carModel = carModel;
        this.yearOfManufacture = yearOfManufacture;
        this.operatingTime = operatingTime;
        this.fuelConsumption = fuelConsumption;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public int getOperatingTime() {
        return operatingTime;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    double getCargoDeliverPrice(Truck truck, double distance) {
        return truck.getCargoDeliverPrice(distance);
    }
}
