package ru.nesterenko.part01.lesson06.task01;

import ru.nesterenko.part01.lesson06.task01.transport.Bus;
import ru.nesterenko.part01.lesson06.task01.transport.Truck;

/**
 * Класс создает два объекта типа Truck и Bus
 *
 * @version 1.0 18 June 2020
 * @author  Igor Nesterenko
 */
public class TransportCompany {

        Truck truck = new Truck("MAN", "F100", 2012, 15,
                47, 10, 30, 120);
        Bus bus = new Bus("ISUZU", "B100", 2020, 25,
                38, 52, 71);
}
