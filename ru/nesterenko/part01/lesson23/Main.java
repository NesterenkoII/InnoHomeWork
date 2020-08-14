package ru.nesterenko.part01.lesson23;

/**
 * Реализовать класс корзины интернет магазина по следующему интерфейсу:
 * interface Basket {
 *
 *     void addProduct(String product, int quantity);
 *
 *     void removeProduct(String product);
 *
 *     void updateProductQuantity(String product, int quantity);
 *
 *     void clear();
 *
 *     List<String> getProducts();
 *
 *     int getProductQuantity(String product);
 *
 * }
 *
 * @version 1.0 12 August 2020
 * @author  NII
 */
public class Main {
    public static void main(String[] args) {
        ShopBasket shopBasket = new ShopBasket();

        shopBasket.addProduct("iPhone4s", 1);
        shopBasket.addProduct("iPhone5", 2);
        shopBasket.addProduct("iPhoneSE", 3);
        shopBasket.addProduct("iPhone11", 4);
        shopBasket.addProduct("iPhone11", 4);
        shopBasket.addProduct("iPhoneSE", 3);
        printProucts(shopBasket);
        shopBasket.removeProduct("iPhone5");
        printProucts(shopBasket);
        shopBasket.updateProduct("iPhone11", 10);
        printProucts(shopBasket);
        System.out.println("iPhoneSE: " + shopBasket.getProductQuantity("iPhoneSE"));
        System.out.println("iPhoneS: " + shopBasket.getProductQuantity("iPhoneS"));
        shopBasket.clear();
        printProucts(shopBasket);
    }

    public static void printProucts(ShopBasket shopBasket) {
        for (String str : shopBasket.getProducts()) {
            System.out.println(str);
        }
        System.out.println();
    }
}
