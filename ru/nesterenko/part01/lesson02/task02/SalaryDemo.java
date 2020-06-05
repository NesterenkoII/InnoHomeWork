package ru.nesterenko.part01.lesson02.task02;

public class SalaryDemo {
    public static void main(String[] args) {
        Salary Ivan = new Salary(105200);

        System.out.println("Заработная плата Ивана посе вычета НДФЛ (" + Ivan.getTAX()
                            + " %) составляет " + Ivan.getSalaryFreeTax() + " рублей");
    }
}
