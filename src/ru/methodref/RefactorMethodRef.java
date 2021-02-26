package ru.methodref;

import ru.data.Student;
import ru.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodRef {

    static Predicate<Student> p = RefactorMethodRef::greaterThanGradleLevel;

    public static Boolean greaterThanGradleLevel(Student student) {
        return student.getGradeLevel() >= 3;
    }

    public static void main(String[] args) {
        System.out.println(p.test(StudentDataBase.createStudent.get()));
    }
}
