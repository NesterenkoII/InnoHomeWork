package ru.nesterenko.part01.lesson06.task01;

import ru.nesterenko.part01.lesson06.task01.transport.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс создает два объекта типа Truck и Bus
 *
 * @version 1.0 18 June 2020
 * @author  Igor Nesterenko
 */
public class TransportCompany implements DeliveringPeopleAndCargo {

        List <Transport> transports = new ArrayList<Transport>();

        void addTransport(Transport transport) {
                this.transports.add(transport);
        }

        @Override
        public double getDeliverPrice(Transport transport, double distance) {
                if (transport.getClass() == Bus.class) {
                        return ((Bus) transport).getOneKmUsingCost() * distance;
                }

                if (transport.getClass() == Truck.class) {
                        return ((Truck) transport).getOneKmUsingCost() * distance;
                }

                return 0;
        }

        @Override
        public double getOneTicketPrice(Bus bus, double distance) {
                return (bus.getOneKmUsingCost() * distance / bus.getPASSENGER_SEAT_COUNT());
        }
}
