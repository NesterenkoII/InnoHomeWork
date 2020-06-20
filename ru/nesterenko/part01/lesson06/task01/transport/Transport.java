package ru.nesterenko.part01.lesson06.task01.transport;

/**
 * Класс реализует описывает общие кахактеристики транспортных средств
 *
 * @version 1.0 18 June 2020
 * @author  Igor Nesterenko
 */
public class Transport {

    private final String CAR_BRAND;
    private final String CAR_MODEL;


    public Transport(String carBrand, String carModel) {

        this.CAR_BRAND = carBrand;
        this.CAR_MODEL = carModel;
    }

    public String getCAR_BRAND() {
        return CAR_BRAND;
    }

    public String getCAR_MODEL() {
        return CAR_MODEL;
    }

}
