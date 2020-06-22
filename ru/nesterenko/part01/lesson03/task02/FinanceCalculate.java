package ru.nesterenko.part01.lesson03.task02;

import java.math.BigDecimal;

/**
 * В данном классе реализуются различные финансовые расчеты
 *
 * @version 1.0
 * @author  Igor Nesterenko
 */
public class FinanceCalculate {
    public static BigDecimal salaryFreeTax (BigDecimal salary) {
        return salary.multiply(BigDecimal.valueOf(0.87));
    }
}
