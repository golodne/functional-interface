package ru.exp;

import ru.data.Student;
import ru.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1 = (s) -> s.getGender() == "M";

    public static void filterStudentByGender() {
        List<Student> allStudent = StudentDataBase.getAllStudent();
        allStudent.forEach((student -> {
            if (p1.test(student)) System.out.println(student);
        }));
    }

    public static void main(String[] args) {
        filterStudentByGender();
    }
}
