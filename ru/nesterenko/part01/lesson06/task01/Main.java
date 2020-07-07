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

        TransportCompany dhl;
        double profit = 0;
        double distance;
        {
            distance = 1500.0;
        }

        dhl = new TransportCompany();
        dhl.addTransport(new Truck("Man", "M-55"));
        dhl.addTransport(new Bus("Ikarus", "I-33"));

        System.out.printf("<%s> %s %s: услуга по доставке стоит - %s\n",
                dhl.getTransport(0).getClass().getSimpleName(),
                dhl.getTransport(0).getCarBrand(),
                dhl.getTransport(0).getCarModel(),
                dhl.getTransport(0).getOneKmUsingCost());
        System.out.printf("<%s> %s %s: услуга по доставке стоит - %s\n",
                dhl.getTransport(1).getClass().getSimpleName(),
                dhl.getTransport(1).getCarBrand(),
                dhl.getTransport(1).getCarModel(),
                dhl.getTransport(1).getOneKmUsingCost());
        dhl.getTransport(0).getClass();

        System.out.println(dhl.deliver());

        dhl.getTransport(0).setOneKmUsingCost(100);
        dhl.getTransport(1).setOneKmUsingCost(200);
        System.out.println(dhl.getDeliverPrice(30));
        System.out.println(dhl.getDeliverPrice(40));

        System.out.println(dhl.getTransport(0).getOneKmUsingCost());
        System.out.println(dhl.getTransport(1).getOneKmUsingCost());

        dhl.getTransport(0).iAmGoing(1);
        dhl.getTransport(1).iAmGoing(2);

        //System.out.println(dhl.getTransport(0));
    }
}
