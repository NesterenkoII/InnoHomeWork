package ru.nesterenko.part01.lesson06.task01.transport;

public interface DeliveringPeopleAndCargo {

    public double getDeliverPrice(Transport transport, double distance);

    public double getOneTicketPrice(Bus bus, double distance);
}
