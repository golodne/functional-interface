package ru.methodref;

import ru.data.Student;
import ru.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodRef {

    static Consumer<Student> c1 = p -> System.out.println(p);

    static Consumer<Student> c2 = System.out::println;

    public static void main(String[] args) {
        StudentDataBase.getAllStudent()
                .forEach(c1);

        StudentDataBase.getAllStudent()
                .forEach(c2);
    }
}
