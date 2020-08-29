package ru.nesterenko.part01.lesson23;

import java.util.ArrayList;
import java.util.List;

public class ShopBasket implements Basket {
    private final ArrayList<Product> productList;

    ShopBasket(){
        productList = new ArrayList<>();
    }

    @Override
    public void addProduct(String name, int quantity) {
        // Находим нужную строку в корзине
        Product product = searchProduct(name);
        if (product == null) {
            product = new Product(name, 0);
            productList.add(product);
        }

        // Добавляем нужное количество
        product.setQuantity(product.getQuantity() + quantity);
    }

    @Override
    public void removeProduct(String productName) {
        productList.removeIf(product -> product.getName().equals(productName));
    }

    @Override
    public void updateProduct(String productName, int quantity) {
        Product product = searchProduct(productName);
        if (product != null) {
            product.setQuantity(quantity);
        } else {
            System.out.println("No such product");
        }
    }

    @Override
    public void clear() {
            productList.clear();
        }

    @Override
    public List<String> getProducts() {
        List<String> stringList = new ArrayList<>();
        if (productList.isEmpty()) {
            stringList.add("Basket is empty");
        } else {
            for (Product p : productList) {
                stringList.add(p.toString());
            }
        }
            return stringList;
    }

    @Override
    public int getProductQuantity(String product) { //TODO test todohi
        for (Product p : productList) {
            if (p.getName().equals(product)) {
                return p.getQuantity();
            }
        }
        return 0;
    }

    private Product searchProduct(String name) {
        for (Product p : productList) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }
}
