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
public class TransportCompany implements Delivering {

        private List<Transport> transportList = new ArrayList<>();

        public Transport getTransport(Transport transport) {
                return transportList.add(transport);
        }

        public TransportCompany() {
                List<Transport> transports = new ArrayList<>();
        }

        public void addTransport(Transport transport) {
                this.transportList.add(transport);
        }

        @Override
        public String deliver() {
                return "Транспортируем грузы и людей";
        }

        @Override
        public String getDeliverPrice(double distance) {
                        return String.valueOf(this.getDeliverPrice(distance));
        }
}
