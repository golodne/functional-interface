package ru.exp;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateExample {

    static Predicate<Integer> p = (i) -> {
        return (i % 2) == 0;
    };

    static Predicate<Integer> pMod2 = (i) -> i%2==0;

    static Predicate<Integer> pMod5 = (i) -> i%5==0;

    public static void predicateAnd() {
        System.out.println(pMod2.and(pMod5).test(10));
    }

    public static void predicateOr() {
        System.out.println(pMod2.or(pMod5).test(2));
    }

    public static void predicateNegage() {
        System.out.println(pMod2.or(pMod5).negate().test(8));
    }

    public static void main(String[] args) {
        predicateAnd();
        predicateOr();
        predicateNegage();

        Predicate<Integer> p10 = (item) -> item % 2 == 0;
        Stream.of(1, 2, 3, 4, 5, 6, 7)
                .filter(p10.negate())
                .forEach((k) -> System.out.println(k));

     //   System.out.println(p2.test(4));
    }
}
