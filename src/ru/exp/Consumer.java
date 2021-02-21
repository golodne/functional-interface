package ru.exp;

import ru.data.Student;
import ru.data.StudentDataBase;

import java.util.List;


public class Consumer {

    static java.util.function.Consumer<Student> c2 = student -> System.out.println(student);
    static java.util.function.Consumer<Student> consName = (student) -> System.out.println(student.getName());
    static java.util.function.Consumer<Student> consActivites = (student) -> System.out.println(student.getActivites());

    public static void printNames() {

        List<Student> allStudent = StudentDataBase.getAllStudent();
        allStudent.forEach(c2);
    }

    public static void printNameAndGender() {

        List<Student> allStudent = StudentDataBase.getAllStudent();
        allStudent.forEach(consName.andThen(consActivites));
    }

    public static void printCondition() {

        List<Student> allStudent = StudentDataBase.getAllStudent();
        allStudent.forEach(student -> {
            consName.andThen(consActivites).accept(student);
        });
    }


    public static void main(String[] args) {
        //Consumer<String> mappingConsumer = (s -> System.out.println(s.toUpperCase()));
        // test(Arrays.asList("test1","test2"), mappingConsumer);
        printCondition();
    }

    //применить к списку консюмер и вывести каждый элемент
    public static <T> void test(List<T> list1, java.util.function.Consumer<T> consumer) {
        list1.forEach(consumer::accept);
        printNames();
    }
}
