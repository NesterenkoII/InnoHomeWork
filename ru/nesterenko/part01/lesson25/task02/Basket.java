package ru.nesterenko.part01.lesson25.task02;

import java.util.List;

public interface Basket {

    void addProduct(String product, int quantity);

    void removeProduct(String product);

    void updateProduct(String product, int quantity);

    void clear();

    List<String> getProducts();

    int getProductQuantity(String product);
}
