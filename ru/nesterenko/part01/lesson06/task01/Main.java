package ru.nesterenko.part01.lesson06.task01;

import ru.nesterenko.part01.lesson06.task01.transport.Bus;
import ru.nesterenko.part01.lesson06.task01.transport.Truck;

/**
 * Используя полученные знания об объектно-ориентированном программировании смоделировать какую-нибудь предметную область.
 *
 * Например: банк, университет, библиотека, склад, магазин, пруд и т.д.
 *
 * Ограничения:
 *
 * Минимум 3 класса
 * Наличие нескольких полей и методов
 * Использование модификаторов доступа
 * Использование принципов ООП
 *
 * @version 1.0 18 June 2020
 * @author  Igor Nesterenko
 */
public class Main {

    public static void main(String[] args) {

        TransportCompany DHL;
        double profit = 0;
        double distanceForTruck;
        double distanceForBus;
        {
            distanceForTruck = 1500.0;
            distanceForBus = 3000.0;
        }

        DHL = new TransportCompany();

        DHL.transports.add(0, new Truck("MAN", "M11", 79));
        DHL.transports.add(1, new Bus("ISUZU", "I22", 48, 37));

        System.out.print(DHL.transports.get(0).getCAR_BRAND() + " - "
                            + DHL.transports.get(0).getCAR_MODEL() + ":  ");
        ((Truck)DHL.transports.get(0)).iAmGoing(distanceForTruck);
        System.out.println("Заработал: " + DHL.getDeliverPrice(DHL.transports.get(0), distanceForTruck) + " рублей\n");

        System.out.print(DHL.transports.get(1).getCAR_BRAND() + " - "
                            + DHL.transports.get(1).getCAR_MODEL() + ":  ");
        ((Bus)DHL.transports.get(1)).iAmGoing(distanceForBus);
        System.out.println("Заработал: " + DHL.getDeliverPrice(DHL.transports.get(1), distanceForBus) + " рублей");

        profit += DHL.getDeliverPrice(DHL.transports.get(0), distanceForTruck)
                + DHL.getDeliverPrice(DHL.transports.get(1), distanceForBus);

        System.out.println("\nОбщая прибыль компании составила: " + profit + " рублей\n");
    }
}
