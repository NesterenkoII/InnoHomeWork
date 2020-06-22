package ru.nesterenko.part01.lesson06.task01.transport;

public class Bus extends Transport implements Driving{

    private final int PASSENGER_SEAT_COUNT;

    private double oneKmUsingCost;

    public Bus(String carBrand, String carModel, int passengerSeatCont, double oneKmUsingCost) {
            super(carBrand, carModel);

            this.PASSENGER_SEAT_COUNT = passengerSeatCont;
            this.oneKmUsingCost = oneKmUsingCost;
    }

    public double getOneKmUsingCost() {
        return oneKmUsingCost;
    }

    public void setOneKmUsingCost(double oneKmUsingCost) {
        this.oneKmUsingCost = oneKmUsingCost;
    }

    public int getPASSENGER_SEAT_COUNT() {
        return PASSENGER_SEAT_COUNT;
    }

    @Override
    public void iAmGoing(double km) {
        System.out.print("Автобус едет " + km + " km");
        System.out.println();
    }
}
