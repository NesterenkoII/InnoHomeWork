package ru.nesterenko.part01.lesson02.task02;

import java.math.BigDecimal;

/**
 * В данном классе реализуется расчет заработной платы после вычета НДФЛ
 *
 * @version 1.0
 * @author  Igor Nesterenko
 */
public class Salary {
    final BigDecimal salaryWithTax;

    Salary(final double sal) {
        salaryWithTax = new BigDecimal(String.valueOf(sal));
    }
}


class SalaryCalculate {
    BigDecimal init;
    double taxa;
    String salRes;
    String N;

    N = {String.valueOf(taxa)};
    SalaryCalculate(Salary name, double tax) {
       salRes = new BigDecimal(String.valueOf("init") * String.valueOf("tax"));
       taxa = tax;
    }
}
