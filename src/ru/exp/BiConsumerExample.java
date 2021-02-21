package ru.exp;

import ru.data.Student;
import ru.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void nameAndActivites() {

        BiConsumer<String, List<String>> biConsumer = (name, activites) -> System.out.println("name: "+name + "activites: " + activites);

        List<Student> studentList = StudentDataBase.getAllStudent();
        studentList.stream()
                .forEach(student -> biConsumer.accept(student.getName(), student.getActivites()));
    }

    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (a, b) -> {
            System.out.println("a: " + a + " b: " + b);
        };

        biConsumer.accept("test1", "test2");

        BiConsumer<Integer, Integer> multiple = (x,y)-> {
            System.out.println("mult: " + x*y);
        };
        multiple.accept(3,4);

        BiConsumer<Integer, Integer> divis = (x,y)-> {
            System.out.println("div: " + x/y);
        };

        multiple.andThen(divis).accept(6,3);

        nameAndActivites();
    }
}
