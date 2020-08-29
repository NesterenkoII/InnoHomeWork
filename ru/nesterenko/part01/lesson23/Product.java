package ru.nesterenko.part01.lesson23;

import java.util.Comparator;

public class Product {
    private final String name;
    private int quantity;

    Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    String getName() {
        return this.name;
    }

    void setQuantity (int quantity) {
        this.quantity = quantity;
    }

    int getQuantity() {
        return this.quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
