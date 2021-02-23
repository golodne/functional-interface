package ru.exp;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    static Comparator<Integer> comparator = (a,b) -> a.compareTo(b);

    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;

        System.out.println(binaryOperator.apply(3,4));

        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println("max by is " + maxBy.apply(10,100));

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println("min by is " + minBy.apply(10,100));
    }
}
