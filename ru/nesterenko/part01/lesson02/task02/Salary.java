package ru.nesterenko.part01.lesson02.task02;

import java.math.BigDecimal;

/**
 * В данном классе реализуется расчет заработной платы после вычета НДФЛ
 *
 * @version 1.0
 * @author  Igor Nesterenko
 */
public class Salary {
    BigDecimal salaryWithTax;

    Salary(String sal) {
        salaryWithTax = new BigDecimal(sal);
    }
}


class SalaryCalculate {

    public static BigDecimal salaryCalculate (BigDecimal sal, double tax) {
        return sal.multiply(BigDecimal.valueOf(1-tax));
    }

}
