package ru.data;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentDataBase {

    public static List<Student> getAllStudent() {

        Student student1 = new Student("Vova", "M", Arrays.asList("volebol", "futbol"));
        Student student2 = new Student("Ivan", "M", Collections.emptyList());

        Student student3 = new Student("Ira", "F", Collections.emptyList());
        Student student4 = new Student("Vika", "F", Arrays.asList("english", "mathematics"));

        List<Student> students = Arrays.asList(student1,student2, student3, student4);
        return students;
    }
}
