package ru.nesterenko.part01.lesson02.task02;

/**
 * В данном классе реализуется расчет заработной платы после вычета НДФЛ
 *
 * @version 1.0
 * @author  Igor Nesterenko
 */
public class Salary {
    final double TAX = 0.13;
    final double salaryWithTax;

    Salary(final double sal) {
        salaryWithTax = sal;
    }

    final double getSalaryWithTax () {
        return salaryWithTax;
    }

    final double getTAX() {
        return TAX;
    }

    final double getSalaryFreeTax () {
        return (salaryWithTax - (salaryWithTax * TAX));
    }
}
