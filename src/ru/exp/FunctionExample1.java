package ru.exp;

public class FunctionExample1 {

    public static String performConcat(String str) {
        return FunctionExample.addSomeString.apply(str);
    }

    public static void main(String[] args) {
        String hello = performConcat("Hello");
        System.out.println("result " + hello);
    }
}
