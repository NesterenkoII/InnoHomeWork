package ru.stc;

public class CheckedException {

    public static void main(String[] args) {
        try {
            System.out.println("step 1");
            method();
            System.out.println("step 2");
        } catch (Throwable ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("step 3");
    }

    public static void method() throws Exception {
        throw new Exception("error");
    }
}
