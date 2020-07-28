package ru.nesterenko.part01.lesson19;

import java.math.BigDecimal;

public class Product {
    private String name;
    private BigDecimal count;
    private BigDecimal price;

    public Product(String name, BigDecimal count, BigDecimal price) {
        this.name = name;
        this.count = count;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public BigDecimal getCount() {
        return count;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
