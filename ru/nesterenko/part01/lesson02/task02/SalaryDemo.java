package ru.nesterenko.part01.lesson02.task02;

class SalaryDemo {
    public static void main(String[] args) {
        Salary Ivan = new Salary("105239");

        System.out.println("Ivan's salary free tax = "
                            + SalaryCalculate.salaryCalculate(Ivan.salaryWithTax, 0.2));
    }
}
