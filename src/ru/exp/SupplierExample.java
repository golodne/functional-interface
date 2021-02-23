package ru.exp;

import ru.data.Student;

import java.util.Arrays;
import java.util.function.Supplier;

public class SupplierExample {

    static Supplier<Integer> supplier = () -> {
        return 1;
    };

    public static void main(String[] args) {
        System.out.println(supplier.get());

        Supplier<Student> studentSupplier = () -> {
            Student student = new Student("Vova", "M", 1, Arrays.asList("volebol", "futbol"));
            return student;
        };

        System.out.println("student " + studentSupplier.get());

    }
}
