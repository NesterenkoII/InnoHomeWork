package ru.nesterenko.part01.lesson02.task03;

public class HourDemo {
    public static void main(String[] args) {
        Hour secN = new Hour(3600);

        System.out.println("В " + secN.getSecondNumber() + " секундах "
                            + secN.getHourNumber() + " часов");
    }
}
