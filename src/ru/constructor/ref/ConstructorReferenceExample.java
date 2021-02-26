package ru.constructor.ref;

import ru.data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {

    static Supplier<Student> studentSupplier = Student::new;

    static Function<String, Student> studentFunction = Student::new;

    public static void main(String[] args) {
        Student student = studentSupplier.get();
        System.out.println(student);
        System.out.println(studentFunction.apply("Ivan"));
    }
}
