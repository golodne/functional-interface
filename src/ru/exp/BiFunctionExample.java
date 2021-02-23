package ru.exp;

import ru.data.Student;
import ru.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    static BiFunction<String,Integer,String> biFunction = (name, age) -> {
        return name.toUpperCase() + " age: " + age;
    };

    static BiFunction<List<Student>, Predicate<Student>, Map<String,Integer>> biFunction1 = ((students, studentPredicate) -> {
       Map<String, Integer> studentsMap = new HashMap<>();
       students.forEach(student -> {
           if (studentPredicate.test(student)) studentsMap.put(student.getName(), student.getGradeLevel());
       });
       return studentsMap;
    });

    public static void main(String[] args) {
        String str = biFunction.apply("Vladimir", 37);
        System.out.println(str);
        System.out.println(biFunction1.apply(StudentDataBase.getAllStudent(), PredicateStudentExample.p1));
    }
}
