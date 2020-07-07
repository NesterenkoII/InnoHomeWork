package ru.stc;

public class UncheckedException {

    public static void main(String[] args) {

        System.out.println("Start");
        method();
        System.out.println("Finish");
    }

    public static void method() {
        int [] array = new int[2];
        array[0] = 1;
        array[1] = 2;

        try {
            System.out.println(array[2]);
        } catch (ArrayIndexOutOfBoundsException ex) {
        }
        System.out.println(array[1]);
    }
}
