package ru.data;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class StudentDataBase {

    public static Supplier<Student> createStudent = () -> new Student("Vova", "M", 5, Arrays.asList("volebol", "futbol"));

    public static List<Student> getAllStudent() {

        Student student1 = new Student("Vova", "M", 1, Arrays.asList("volebol", "futbol"));
        Student student2 = new Student("Ivan", "M", 2, Collections.emptyList());

        Student student3 = new Student("Ira", "F", 3, Collections.emptyList());
        Student student4 = new Student("Vika", "F", 4, Arrays.asList("english", "mathematics"));

        List<Student> students = Arrays.asList(student1,student2, student3, student4);
        return students;
    }
}
