package ru.nesterenko.part01.lesson02.task02;

import java.math.BigDecimal;

/**
 * В данном классе реализуются различные финансовые расчеты
 *
 * @version 1.0
 * @author  Igor Nesterenko
 */
public class FinanceCalculate {
    public static BigDecimal salaryFreeTax (BigDecimal salary, double tax) {
        return salary.multiply(BigDecimal.valueOf(1-tax));
    }
}
