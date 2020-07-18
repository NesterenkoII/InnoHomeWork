package ru.nesterenko.part01.lesson07.newVesrsion;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.nesterenko.part01.lesson07.newVesrsion.VendingDevice.Drink;
import ru.nesterenko.part01.lesson07.newVesrsion.VendingDevice.Menu;
import ru.nesterenko.part01.lesson07.newVesrsion.VendingDevice.VendingDevice;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @lesson07
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
 * @lesson14
 * Добавить в программу "Вендинговый автомат" журналирование событий, при этом стоит указать различные
 * уровни логирования, как информационного уровня, так и предупреждения и ошибки.
 * Настроить сбор логов в файл.
 * Фреймворк логирования - на ваш выбор.
 *
 * @author  4.0 18 July 2020
 * @author  Igor Nesterenko
 */
public class Main {

    private static final Logger log = LogManager.getLogger(Main.class.getName());

    public static void main(String[] Args) {

            int choice = 1;
            VendingDevice myVendingDevice = createVendingDevice();
            Menu menu = new Menu();
            Scanner enterChoice;


                do {
                    try {
                    menu.drawVendingMachineStatMenu(myVendingDevice);
                    enterChoice = new Scanner(System.in);
                    choice = enterChoice.nextInt();

                    switch (choice) {
                        case 0:
                            log.info("Выход ...");
                            break;
                        case 1:
                            System.out.print("         Введите сумму: ");
                            myVendingDevice.addMoney(enterChoice.nextDouble());
                            System.out.println();
                            break;
                        case 2:
                            myVendingDevice.giveDrink(myVendingDevice.getDrinksList().get(0));
                            break;
                        case 3:
                            myVendingDevice.giveDrink(myVendingDevice.getDrinksList().get(1));
                            break;
                        case 4:
                            myVendingDevice.giveDrink(myVendingDevice.getDrinksList().get(2));
                            break;
                        case 5:
                            myVendingDevice.giveDrink(myVendingDevice.getDrinksList().get(3));
                            break;
                        case 6:
                            myVendingDevice.giveDrink(myVendingDevice.getDrinksList().get(4));
                            break;
                        default:
                            log.info("Нет такого пункта меню");
                    }

                    } catch (InputMismatchException e) {
                        log.fatal("Аварийное завершение работы автомата!!!");
                    }
                } while (choice != 0);

    }
        private static VendingDevice createVendingDevice() {
            VendingDevice device = new VendingDevice();
            device.addDrink(Drink.FANTA, 1);
            device.addDrink(Drink.SPRIT, 2);
            device.addDrink(Drink.JUICE, 3);
            device.addDrink(Drink.PEPSI, 4);
            device.addDrink(Drink.WATER, 5);
            return device;
        }
    }