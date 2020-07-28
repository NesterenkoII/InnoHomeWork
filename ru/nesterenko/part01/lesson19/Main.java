package ru.nesterenko.part01.lesson19;

import java.io.IOException;
import java.math.BigDecimal;

/**
 * Дан текстовый файл определенной структуры, в котором содержится информация о покупках.
 *
 * Формат файла:
 *
 * Название товара
 * количество
 * цена
 *
 * Необходимо написать программу, которая выведет на экран чек,
 * сформированный из этого файла. В чеке должна быть информация:
 *
 * название товара:  цена Х кол-во = стоимость
 *
 * В конце отчета вывести итоговую стоимость.
 *
 * Пример входного файла и вывода прикрепляю к задаче
 *
 * @version 1.0 28 July 2020
 * @author NII
 */
public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        String path = "/Users/NII/Desktop/Development/src/ru/nesterenko/part01/lesson19/products.txt";
        //order.addProduct(new Product("Молоко", 0.75, new BigDecimal(95.2)));
        //order.addProduct(new Product("Хлеб", 4, new BigDecimal(25.0)));
        try {
            order.addProductFromFile(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        order.printOrder();
    }
}
