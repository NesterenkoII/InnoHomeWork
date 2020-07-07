package ru.nesterenko.part01.lesson06.task01.transport;

public class Truck extends Transport implements Driving, Delivering {

    public Truck(String carBrand, String carModel) {
        super(carBrand, carModel);
    }

    public Truck(String carBrand, String carModel, double oneKmUsingCost) {
        super(carBrand, carModel, oneKmUsingCost);
    }

    @Override
    public void iAmGoing(double km) {
        System.out.print("Грузовик едет " + km + " km");
        System.out.println();
    }

    @Override
    public String deliver() {
        return "Доставляю грузы";
    }

    @Override
    public String getDeliverPrice(double distance) {
        return "Для расчета стоимости доставки обратитесь в трансаортную компанию";
    }
}
