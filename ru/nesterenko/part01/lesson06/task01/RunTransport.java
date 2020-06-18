package ru.nesterenko.part01.lesson06.task01;

public class RunTransport {
    public static void main(String[] args) {
        double profit = 0;

        TransportCompany cargoInc = new TransportCompany();

        profit += cargoInc.truck.getCargoDeliverPrice(190);
        profit += cargoInc.bus.getPassengersDeliverPrice(190);

        System.out.println("Прибыль компании: " + profit + " рублей");
        System.out.printf("Стоимость одного билета на автобус: %.2f рублей",
                            cargoInc.bus.getOneTicketPrice(17,190));



    }
}
