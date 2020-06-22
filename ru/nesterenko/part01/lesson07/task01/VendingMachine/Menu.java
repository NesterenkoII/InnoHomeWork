package ru.nesterenko.part01.lesson07.task01.VendingMachine;


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

    public void drawVendingMachineStatMenu(VendingMachine vendingMachine) {
        System.out.println("");
        System.out.println("_________________________________________________");
        System.out.println("|     Dыберите пункт меню и нажмите \"Enter\"     |");
        System.out.println("|===============================================|");
        System.out.println("|                      МЕНЮ                     |");
        System.out.println("|----------------+----------------+-------------|");
        System.out.println("|Наименование    |   Цена, руб.   | Остаток, шт |");
        System.out.println("|----------------+----------------+-------------|");

        System.out.println("| 2 - " + vendingMachine.getDrinksList().get(0).name()
                + "      |      " + vendingMachine.getDrinksList().get(0).getPrice()
                + "      |     " + vendingMachine.getDrinksList().get(0).getCount() + "       |");

        System.out.println("| 3 - " + vendingMachine.getDrinksList().get(1).name()
                + "      |      " + vendingMachine.getDrinksList().get(1).getPrice()
                + "      |     " + vendingMachine.getDrinksList().get(1).getCount() + "       |");

        System.out.println("| 4 - " + vendingMachine.getDrinksList().get(2).name()
                + "      |      " + vendingMachine.getDrinksList().get(2).getPrice()
                + "      |     " + vendingMachine.getDrinksList().get(2).getCount() + "       |");

        System.out.println("| 5 - " + vendingMachine.getDrinksList().get(3).name()
                + "      |      " + vendingMachine.getDrinksList().get(3).getPrice()
                + "      |     " + vendingMachine.getDrinksList().get(3).getCount() + "       |");

        System.out.println("| 6 - " + vendingMachine.getDrinksList().get(4).name()
                + "      |      " + vendingMachine.getDrinksList().get(4).getPrice()
                + "      |     " + vendingMachine.getDrinksList().get(4).getCount() + "       |");

        System.out.println("|===============================================|");
        System.out.println("            Текущий баланс: " + vendingMachine.getDEPOSIT() + " рублей                 ");
        System.out.println("|===============================================|");
        System.out.println("|    1 - Пополнить баланс       0 - Выход       |");
        System.out.println("|----------------+----------------+-------------|");
        System.out.print("                  Ваш выбор - " );
    }
}
