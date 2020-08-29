package ru.nesterenko.part01.lesson25.task02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShopBasket implements Basket {
    private final Map<String, Integer> productMap;

    ShopBasket(){
        productMap = new HashMap<>();
    }

    @Override
    public void addProduct(String product, int quantity) {
        productMap.merge(product, quantity, Integer::sum);
    }

    @Override
    public void removeProduct(String product) {
        productMap.remove(product);
    }

    @Override
    public void updateProduct(String product, int quantity) {
        productMap.put(product, quantity);
    }

    @Override
    public void clear() {
            productMap.clear();
        }

    @Override
    public List<String> getProducts() {
        List<String> stringList = new ArrayList<>();
        for (Map.Entry<String, Integer> pair : productMap.entrySet()) {
            stringList.add(pair.toString());
        }
            return stringList;
    }

    @Override
    public int getProductQuantity(String product) {
        if (productMap.get(product) == null) {
            return 0;
        } else
        return productMap.get(product);
    }
}
