package ru.nesterenko.part01.lesson07.task01.VendingMachine;


/**
 * Класс реализует отрисовку меню вендингого аппарата
 *
 * @version 1.0 20 June 2020
 * @author  Igor Nestsenko
 */
public class Menu {

    public void drawVendingMachineStatMenu(VendingMachine vendingMachine) {
        System.out.println("");
        System.out.println("_________________________________________________");
        System.out.println("|   Dыберите пункт меню и нажмите \"Enter\"       |");
        System.out.println("|===============================================|");
        System.out.println("|                    МЕНЮ                       |");
        System.out.println("|----------------+----------------+-------------|");
        System.out.println("|Наименование    |   Цена, руб.   | Остаток, шт |");
        System.out.println("|----------------+----------------+-------------|");
        System.out.println("| 1 - Фанта      |   ( " + vendingMachine.drinksArray.get(0).getPrice() + " )     |     "
                            + vendingMachine.drinksArray.get(0).getCount() + "       |");
        System.out.println("| 2 - Кока-Кола  |   ( " + vendingMachine.drinksArray.get(1).getPrice() + " )     |     "
                            + vendingMachine.drinksArray.get(1).getCount() + "       |");
        System.out.println("| 3 - Спрайт     |   ( " + vendingMachine.drinksArray.get(2).getPrice() + " )     |     "
                            + vendingMachine.drinksArray.get(2).getCount() + "       |");
        System.out.println("|_______________________________________________|");
        System.out.println("| 4 - Пополнить баланс                          |");
        System.out.println("| 0 - Выход                                     |");
        System.out.println("|===============================================|");
        System.out.println("            Текущий баланс: " + vendingMachine.getDEPOSIT() + " рублей                 ");
        System.out.println("|===============================================|");
        System.out.print("                  Ваш выбор - " );
    }
}
