package ru.nesterenko.part01.lesson07.task01.VendingMachine;


/**
 * Класс реализует отрисовку меню вендингого аппарата
 * В автоматическом режиме прорисовывает элементы меню
 * в зависимости от загрузки автомата
 *
 * @version 2.1 21 June 2020
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

        for (Drinks drink: vendingMachine.drinksArray) {
            System.out.printf("| %1d - %2s \t |\t( %4.1f )      |     %2d      |\n",
                    (i + 2),
                    vendingMachine.drinksArray.get(i).name(),
                    vendingMachine.drinksArray.get(i).getPrice(),
                    vendingMachine.drinksArray.get(i).getCount());
            i++;
        }

        System.out.println("|===============================================|");
        System.out.println("            Текущий баланс: " + vendingMachine.getDEPOSIT() + " рублей                 ");
        System.out.println("|===============================================|");
        System.out.println("|    1 - Пополнить баланс       0 - Выход       |");
        System.out.println("|----------------+----------------+-------------|");
        System.out.print("                  Ваш выбор - " );
    }
}
