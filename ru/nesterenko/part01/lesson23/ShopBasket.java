package ru.nesterenko.part01.lesson23;

import java.util.ArrayList;
import java.util.List;

public class ShopBasket implements Basket {
    private ArrayList<Product> productList;

    ShopBasket(){
        productList = new ArrayList<>();
    }

    @Override
    public void addProduct(String product, int quantity) {
        int index = 0;
        for (Product p : productList) {
            if (p.getName().equals(product)) {
                productList.set(index, new Product(product, p.getQuantity() + quantity));
                return;
            }
            index++;
        }
        productList.add(new Product(product,quantity));
    }

    @Override
    public void removeProduct(String product) {
        int index = 0;
        for (Product p : productList) {
            if (p.getName().equals(product)) {
                break;
            }
            index++;
        }
        productList.remove(index);
    }

    @Override
    public void updateProduct(String product, int quantity) {
        int index = 0;
        for (Product p : productList) {
            if (p.getName().equals(product)) {
                productList.set(index, new Product(product, quantity));
                break;
            }
            index++;
        }
    }

    @Override
    public void clear() {
            int index = productList.size() - 1;
            while (!productList.isEmpty()) {
                productList.remove(index);
                index--;
            }
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
    public int getProductQuantity(String product) {
        for (Product p : productList) {
            if (p.getName().equals(product)) {
                return p.getQuantity();
            }
        }
        return 0;
    }
}
