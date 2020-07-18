package ru.nesterenko.part01.lesson07.newVesrsion.VendingDevice;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Класс реализует отрисовку меню вендингого аппарата
 * В автоматическом режиме прорисовывает элементы меню
 * в зависимости от загрузки автомата
 *
 * @version 2.2 22 June 2020
 * @author  Igor Nestsenko
 */
public class Menu {

    int i = 0;

    public void drawVendingMachineStatMenu(VendingDevice vendingDevice) {
        System.out.println("");
        System.out.println("_________________________________________________");
        System.out.println("|     Dыберите пункт меню и нажмите \"Enter\"     |");
        System.out.println("|===============================================|");
        System.out.println("|                      МЕНЮ                     |");
        System.out.println("|----------------+----------------+-------------|");
        System.out.println("|Наименование    |   Цена, руб.   | Остаток, шт |");
        System.out.println("|----------------+----------------+-------------|");

        System.out.println("| 2 - " + vendingDevice.getDrinksList().get(0).name()
                + "      |      " + vendingDevice.getDrinksList().get(0).getPrice()
                + "      |     " + vendingDevice.getDrinksList().get(0).getCount() + "       |");

        System.out.println("| 3 - " + vendingDevice.getDrinksList().get(1).name()
                + "      |      " + vendingDevice.getDrinksList().get(1).getPrice()
                + "      |     " + vendingDevice.getDrinksList().get(1).getCount() + "       |");

        System.out.println("| 4 - " + vendingDevice.getDrinksList().get(2).name()
                + "      |      " + vendingDevice.getDrinksList().get(2).getPrice()
                + "      |     " + vendingDevice.getDrinksList().get(2).getCount() + "       |");

        System.out.println("| 5 - " + vendingDevice.getDrinksList().get(3).name()
                + "      |      " + vendingDevice.getDrinksList().get(3).getPrice()
                + "      |     " + vendingDevice.getDrinksList().get(3).getCount() + "       |");

        System.out.println("| 6 - " + vendingDevice.getDrinksList().get(4).name()
                + "      |      " + vendingDevice.getDrinksList().get(4).getPrice()
                + "      |     " + vendingDevice.getDrinksList().get(4).getCount() + "       |");

        System.out.println("|===============================================|");
        System.out.println("            Текущий баланс: " + vendingDevice.getDeposit() + " рублей                 ");
        System.out.println("|===============================================|");
        System.out.println("|    1 - Пополнить баланс       0 - Выход       |");
        System.out.println("|----------------+----------------+-------------|");
        System.out.print("                  Ваш выбор - " );
    }
}
