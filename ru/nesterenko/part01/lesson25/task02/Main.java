package ru.nesterenko.part01.lesson25.task02;

import java.util.List;

/**
 * lesson25
 * Реализовать класс корзины интернет магазина по следующему интерфейсу, используя реализацию мапы:
 * interface Basket {
 *     void addProduct(String product, int quantity);
 *     void removeProduct(String product);
 *     void updateProductQuantity(String product, int quantity);
 *     void clear();
 *     List<String> getProducts();
 *     int getProductQuantity(String product);
 * }
 *
 * @version 1.0 28 August 2020
 * @author  NII
 */
public class Main {
    public static void main(String[] args) {
        ShopBasket shopBasket = new ShopBasket();

        shopBasket.addProduct("iPhone4s", 1);
        shopBasket.addProduct("iPhone5", 2);
        shopBasket.addProduct("iPhoneSE", 3);
        shopBasket.addProduct("iPhoneSE", 3);
        shopBasket.addProduct("iPhone11", 4);
        shopBasket.addProduct("iPhone11", 4);
        printList(shopBasket.getProducts());

        shopBasket.removeProduct("iPhone5");
        printList(shopBasket.getProducts());

        shopBasket.updateProduct("iPhone11", 10);
        printList(shopBasket.getProducts());

        System.out.println("iPhoneSE: " + shopBasket.getProductQuantity("iPhoneSE"));
        System.out.println("iPhoneS: " + shopBasket.getProductQuantity("iPhoneS"));

        shopBasket.clear();
        printList(shopBasket.getProducts());
    }

    public static void printList(List<String> list) {
        for (String str : list) {
            System.out.println(str);
        }
        System.out.println();
    }
}
