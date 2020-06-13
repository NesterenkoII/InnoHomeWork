package ru.nesterenko.part01.lesson03.task01;

import java.math.BigDecimal;

public class CalculateCostOfGoods {
    public static BigDecimal calculateFuelCost(double amountOfGoods, double unitPrice) {
        return BigDecimal.valueOf(amountOfGoods * unitPrice);
    }
}
