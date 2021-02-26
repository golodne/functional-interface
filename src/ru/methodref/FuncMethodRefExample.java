package ru.methodref;

import java.util.function.Function;

public class FuncMethodRefExample {

    static Function<String, String> toUpper = (s -> s.toUpperCase());
    static Function<String, String> toUpper2 = String::toUpperCase;
    public static void main(String[] args) {
        System.out.println(toUpper.apply("test"));
        System.out.println(toUpper2.apply("java8"));
    }
}
