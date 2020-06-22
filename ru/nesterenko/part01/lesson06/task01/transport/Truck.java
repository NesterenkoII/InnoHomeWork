package ru.nesterenko.part01.lesson06.task01.transport;

public class Truck extends Transport implements Driving {

    private double oneKmUsingCost;

    public Truck(String carBrand, String carModel, double oneKmUsingCost) {
        super(carBrand, carModel);
        this.oneKmUsingCost = oneKmUsingCost;
    }

    public void setOneKmUsingCost(double oneKmUsingCost) {
        this.oneKmUsingCost = oneKmUsingCost;
    }

    public double getOneKmUsingCost() {
        return oneKmUsingCost;
    }

    @Override
    public void iAmGoing(double km) {
        System.out.print("Грузовик едет " + km + " km");
        System.out.println();
    }
}
