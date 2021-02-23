package ru.exp;

import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> function = (name) -> name.toUpperCase();
    static Function<String, String> addSomeString = (name) -> name.concat("someString");

    public static void main(String[] args) {
        System.out.println("result as " + function.apply("vasya"));
        System.out.println("result as " + function.andThen(addSomeString).apply("java8"));
        //compose - first addSomeString and then function
        System.out.println("result as " + function.compose(addSomeString).apply("java8"));
    }
}
