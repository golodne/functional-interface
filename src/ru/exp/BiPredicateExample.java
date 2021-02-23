package ru.exp;

import java.util.function.BiPredicate;

public class BiPredicateExample {


    public static void main(String[] args) {

        BiPredicate<Integer, String> biPredicate = (k, v) -> (k % 2) == 0 && "test".equals(v);

        System.out.println(biPredicate.test(5,"test1"));
        System.out.println(biPredicate.test(4,"test"));

    }
}
