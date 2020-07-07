package ru.stc;

public class Error {

    public static void main(String[] args) {
        System.out.println("Start");
        try {
            method();
        } catch (StackOverflowError error) {
            System.out.println("Stack is full");
        }
        System.out.println("Hello");
    }

    public static void method() {
        method();
    }
}