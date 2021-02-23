package ru.exp;

import ru.data.Student;
import ru.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentsExample {

    static Function<List<Student>, Map<String, Integer>> studentFunction = (students) -> {
        Map<String, Integer> studentMap = new HashMap<>();
        students.forEach(student -> {
                    if (PredicateExample.pMod2.test(student.getGradeLevel()))
                    studentMap.put(student.getName(), student.getGradeLevel());
                }
        );
        return studentMap;
    };

    public static void main(String[] args) {
        System.out.println(studentFunction.apply(StudentDataBase.getAllStudent()));
    }
}
