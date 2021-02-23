package ru.exp;

import ru.data.Student;
import ru.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExamples {

     Predicate<Student> p1 = (p1) -> p1.getGradeLevel() >= 2;
     Predicate<Student> p2 = (p2) -> "F".equals(p2.getGender());

     BiConsumer<String, List<String>> studentByConsumer = (name, activeites) -> System.out.println("name: " + name + " act: " + activeites);

     Consumer<Student> studentConsumer = (student -> {
        if (p1.and(p2).test(student)) studentByConsumer.accept(student.getName(), student.getActivites());
    });

    public void printNameAndActivites(List<Student> list) {
        list.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        new PredicateAndConsumerExamples().printNameAndActivites(StudentDataBase.getAllStudent());
    }
}

