package ru.nesterenko.part01.lesson06.task01.transport;

public class Bus extends Transport{

    private int passengerSeatCont;
    private double oneKmUsingCost;

    public Bus(String carBrand, String carModel, int yearOfManufacture,
                    int operatingTime, double fuelConsumption, int passengerSeatCont, double oneKmUsingCost) {
            super(carBrand, carModel, yearOfManufacture,
                    operatingTime, fuelConsumption);

            this.passengerSeatCont = passengerSeatCont;
            this.oneKmUsingCost = oneKmUsingCost;
    }

    public double getPassengersDeliverPrice( double distance) {
        return distance * oneKmUsingCost;
    }

    public double getOneTicketPrice(int passengers, double distance) {
        return (getPassengersDeliverPrice(distance) / passengers);
    }
}
