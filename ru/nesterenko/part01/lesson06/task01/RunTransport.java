package ru.nesterenko.part01.lesson06.task01;

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
