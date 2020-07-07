package ru.nesterenko.part01.lesson08.task01;

import ru.nesterenko.part01.lesson08.task01.CalculatorMethods;

/**
 * Реализовать класс Calculator, который будет содержать статические методы для операций
 * вычитания, сложения, умножения, деления и взятия процента от числа. Класс должен
 * работать как с целыми числами, так и с дробями.
 *
 * @version 1.0 21 June 2020
 * @author  NII
 */
public class Main {
    public static void main(String[] args) {

        CalculatorMenu calculator = new CalculatorMenu();

        do {

            CalculatorMenu.showNumbersEntering(calculator);

            do {
                switch (CalculatorMenu.showMenuMath(calculator)) {
                    case 0:
                        System.out.println("\t\tВыход ...");
                        break;
                    case 1:
                        if (calculator.getNumber1() * 10 % 10 != 0 || calculator.getNumber2() * 10 % 10 != 0) {
                            System.out.println("        Результат:  "
                                    + calculator.getNumber1() + " - "
                                    + calculator.getNumber2() + " = "
                                    + CalculatorMethods.subtraction(calculator.getNumber1(),
                                                                    calculator.getNumber2()));
                        } else {
                            System.out.println("        Результат:  "
                                    + ((int)calculator.getNumber1()) + " - "
                                    + ((int)calculator.getNumber2()) + " = "
                                    + CalculatorMethods.subtraction((int)calculator.getNumber1(),
                                                                    (int)calculator.getNumber2()));
                        }
                        System.out.println();
                        break;
                    case 2:
                        if (calculator.getNumber1() * 10 % 10 != 0 || calculator.getNumber2() * 10 % 10 != 0) {
                            System.out.println("        Результат:  "
                                    + calculator.getNumber1() + " + "
                                    + calculator.getNumber2() + " = "
                                    + CalculatorMethods.summation(calculator.getNumber1(),
                                                                  calculator.getNumber2()));
                        } else {
                            System.out.println("        Результат:  "
                                    + ((int)calculator.getNumber1()) + " + "
                                    + ((int)calculator.getNumber2()) + " = "
                                    + CalculatorMethods.summation((int)calculator.getNumber1(),
                                                                  (int)calculator.getNumber2()));
                        }
                        System.out.println();
                        break;
                    case 3:
                        if (calculator.getNumber1() * 10 % 10 != 0 || calculator.getNumber2() * 10 % 10 != 0) {
                            System.out.println("        Результат:  "
                                    + calculator.getNumber1() + " * "
                                    + calculator.getNumber2() + " = "
                                    + CalculatorMethods.multiplication(calculator.getNumber1(),
                                                                       calculator.getNumber2()));
                        } else {
                            System.out.println("        Результат:  "
                                    + ((int)calculator.getNumber1()) + " * "
                                    + ((int)calculator.getNumber2()) + " = "
                                    + CalculatorMethods.multiplication((int)calculator.getNumber1(),
                                                                       (int)calculator.getNumber2()));
                        }
                        System.out.println();
                        break;
                    case 4:
                        if (calculator.getNumber1() * 10 % 10 != 0 || calculator.getNumber2() * 10 % 10 != 0) {
                            System.out.println("        Результат:  "
                                    + calculator.getNumber1() + " / "
                                    + calculator.getNumber2() + " = "
                                    + CalculatorMethods.division(calculator.getNumber1(),
                                                                 calculator.getNumber2()));
                        } else {
                            System.out.println("        Результат:  "
                                    + ((int)calculator.getNumber1()) + " / "
                                    + ((int)calculator.getNumber2()) + " = "
                                    + CalculatorMethods.division(calculator.getNumber1(),
                                                                 calculator.getNumber2()));
                        }
                        System.out.println();
                        break;
                    case 5:
                        if (calculator.getNumber1() * 10 % 10 != 0 || calculator.getNumber2() * 10 % 10 != 0) {
                            System.out.println("        Результат:  "
                                    + calculator.getNumber2() + " % от "
                                    + calculator.getNumber1() + " = "
                                    + CalculatorMethods.percentOfNumber(calculator.getNumber1(),
                                                                        calculator.getNumber2()));
                        } else {
                            System.out.println("        Результат:  "
                                    + ((int)calculator.getNumber2()) + " % от "
                                    + ((int)calculator.getNumber1()) + " = "
                                    + CalculatorMethods.percentOfNumber(calculator.getNumber1(),
                                                                        calculator.getNumber2()));
                        }
                        System.out.println();
                        break;
                    default:
                        System.out.println("\t*** Выбран несуществующий пункт! ***");
                        System.out.println();
                }
            } while (5 < calculator.getChoice() || calculator.getChoice() < 0);

        } while (calculator.getChoice() != 0);
    }
}
