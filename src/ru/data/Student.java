package ru.data;

import java.util.List;

public class Student {
    private String name;
    private String gender;

    public List<String> getActivites() {
        return activites;
    }


    public void setActivites(List<String> activites) {
        this.activites = activites;
    }

    private List<String> activites;

    public Student(String name, String gender, List<String> activites) {
        this.activites = activites;
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
