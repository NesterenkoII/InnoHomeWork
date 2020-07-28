package ru.nesterenko.part01.lesson19;

import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private static List<Product> productList;

    public Order () {
        productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void printOrder() {
        BigDecimal totalPrice = new BigDecimal("0.000");
        System.out.printf("%1$s\t%3$12s\t%2$11s\t%4$12s\n", "Наименование", "Количество", "Цена", "Стоимость");
        System.out.println("========================================================");
        for (Product p: productList) {
            System.out.printf("%-15s\t%12.2f\t%2s\t%6.4s\t%3s%9.2f\n", p.getName(), p.getPrice(), "x", p.getCount(), "=", p.getPrice().multiply(p.getCount()));
            totalPrice = totalPrice.add(p.getPrice().multiply(p.getCount()));
        }
        System.out.println("========================================================");
        System.out.printf("%-40s%14.2f\n","ИТОГО:",totalPrice);
        System.out.println("========================================================");
    }

    public void addProductFromFile(String path) throws IOException {
        File file = new File(path);
        Reader is = new FileReader(file);
        BufferedReader br = new BufferedReader(is);
        String tempName;
        BigDecimal tempCount;
        BigDecimal tempPrice;
        while (br.ready()) {
            tempName = br.readLine();
            tempCount = new BigDecimal(br.readLine());
            tempPrice = new BigDecimal(br.readLine());
            addProduct(new Product(tempName, tempCount, tempPrice));
        }
        is.close();
        br.close();
    }
}
