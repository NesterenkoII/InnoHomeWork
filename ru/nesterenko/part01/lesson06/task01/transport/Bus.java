package ru.nesterenko.part01.lesson06.task01.transport;

public class Bus extends Transport implements Driving, Delivering{

    private int passengerSeatCount = 0;

    public Bus(String carBrand, String carModel) {
        super(carBrand, carModel);
    }

    public Bus(String carBrand, String carModel, int passengerSeatCont) {
            super(carBrand, carModel);
            this.passengerSeatCount = passengerSeatCont;
    }

    public Bus(String carBrand, String carModel,  double oneKmUsingCost) {
        super(carBrand, carModel, oneKmUsingCost);
    }

    public int getPassengerSeatCount() {
        return passengerSeatCount;
    }

    public void setPassengerSeatCount(int passengerSeatCount) {
        this.passengerSeatCount = passengerSeatCount;
    }

    @Override
    public void iAmGoing(double km) {
        System.out.print("Автобус едет " + km + " km");
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
