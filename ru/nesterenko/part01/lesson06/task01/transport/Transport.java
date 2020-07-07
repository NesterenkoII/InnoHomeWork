package ru.nesterenko.part01.lesson06.task01.transport;

/**
 * Класс реализует описывает общие кахактеристики транспортных средств
 *
 * @version 1.0 18 June 2020
 * @author  Igor Nesterenko
 */
public abstract class Transport implements Driving{

    private final String carBrand;
    private final String carModel;
    private Double oneKmUsingCost = 0.0;


    public Transport(String carBrand, String carModel, Double oneKmUsingCost) {

        this.carBrand = carBrand;
        this.carModel = carModel;
        this.oneKmUsingCost = oneKmUsingCost;
    }

    public Transport(String carBrand, String carModel) {

        this.carBrand = carBrand;
        this.carModel = carModel;
        this.oneKmUsingCost = oneKmUsingCost;
    }

    public void setOneKmUsingCost(double oneKmUsingCost) {
        this.oneKmUsingCost = oneKmUsingCost;
    }

    public Double getOneKmUsingCost() {
        return oneKmUsingCost;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarModel() {
        return carModel;
    }
}
