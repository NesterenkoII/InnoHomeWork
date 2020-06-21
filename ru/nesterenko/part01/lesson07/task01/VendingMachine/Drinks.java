package ru.nesterenko.part01.lesson07.task01.VendingMachine;

/**
 * Перечисление напитков, кодержащее количество, цену и методы для извлечения
 * и установки значений для данных полей
 *
 * @version 1.0 20 June 2020
 * @author  Igor Nesterenko
 */
public enum Drinks {
        FANTA(29),
        PEPSI(33),
        SPRIT(35),
        WATER(17),
        JUICE(52);
        //BEAR(70);


        private double price;
        private int count = 0;

        Drinks(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public void incrementCount() {
            this.count++;
        }

        public void decrementCount() {
            this.count--;
        }
}
