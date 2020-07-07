package ru.nesterenko.part01.lesson07.newVesrsion.VendingDevice;

/**
 * Перечисление напитков, кодержащее количество, цену и методы для извлечения
 * и установки значений для данных полей
 *
 * @version 2.0 22 June 2020
 * @author  Igor Nesterenko
 */
public enum Drink {
        FANTA(29),
        PEPSI(33),
        SPRIT(35),
        WATER(17),
        JUICE(52);

        private double price;
        private int count = 0;

        Drink(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        public void setCount(int count) {
        this.count = count;
        }

        public int getCount() {
            return count;
        }
}
