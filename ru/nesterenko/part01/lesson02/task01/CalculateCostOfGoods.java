package ru.nesterenko.part01.lesson02.task01;

import java.math.BigDecimal;

/**
 * Класс реализует вычисление стоимости различных товаров по их колическтву и стоимости единицы товара
 *
 * @version 2.0 13 June 2020
 * @author  Igor Nesterenko
 */
public class CalculateCostOfGoods {
    public static BigDecimal calculateFuelCost(double amountOfGoods, double unitPrice) {
        return BigDecimal.valueOf(amountOfGoods * unitPrice);
    }
}
