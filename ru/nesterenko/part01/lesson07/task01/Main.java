package ru.nesterenko.part01.lesson07.task01;

import ru.nesterenko.part01.lesson07.task01.VendingMachine.Drinks;
import ru.nesterenko.part01.lesson07.task01.VendingMachine.Menu;
import ru.nesterenko.part01.lesson07.task01.VendingMachine.VendingMachine;

import java.util.Scanner;

/**
 * Реализовать программу «Вендинговый автомат», которая позволит:
 *
 * Посмотреть меню напитков;
 * Внести деньги на внутренний счет. Деньги можно только вносить, автомат сдачи не даёт;
 * Выбрать номер напитка и получить его, если на счету достаточно средств. При этом, сумма
 * на внутреннем счёте должна уменьшиться на стоимость выданного напитка.
 * Программа должна обрабатывать следующие ситуации:
 *
 * Пользователь не внес деньги;
 * Пользователь выбрал более дорогой напиток, чем внесено денег;
 * Пользователь выбрал несуществующий номер напитка.
 * Для хранения напитков предлагается использовать enum. У напитка должна быть цена и название.
 * Для упрощения считаем, что количество напитков не ограничено.
 *
 * @author  3.0 22 June 2020
 * @author  Igor Nesterenko
 */
public class Main {
    public static void main (String[] Args) {

        VendingMachine redSquare;
        Scanner enterChoice;
        int choice;

        redSquare = new VendingMachine();
        redSquare.initVendingMachine(redSquare, 3,4,5,6,7);

        do {
            new Menu().drawVendingMachineStatMenu(redSquare);

            enterChoice = new Scanner(System.in);
            choice = enterChoice.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Выход ...");
                    break;
                case 1:
                    System.out.print("         Введите сумму: ");
                    redSquare.insertMoney(enterChoice.nextDouble());
                    System.out.println();
                    break;
                case 2:
                    redSquare.giveDrink(redSquare.getDrinksList().get(0));
                    break;
                case 3:
                    redSquare.giveDrink(redSquare.getDrinksList().get(1));
                    break;
                case 4:
                    redSquare.giveDrink(redSquare.getDrinksList().get(2));
                    break;
                case 5:
                    redSquare.giveDrink(redSquare.getDrinksList().get(3));
                    break;
                case 6:
                    redSquare.giveDrink(redSquare.getDrinksList().get(4));
                    break;
                default:
                    System.out.println("    *** Выбранный пунк меню отсутствует! ***\n");
            }
        } while (choice != 0);
    }
}
