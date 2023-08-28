package com.javarush.task.task29.task2909.human;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class University {

    String name;
    int age;
    List<Student> students = new ArrayList<>();

    public University(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student getStudentWithAverageGrade(double averageGrade) {
        return getStudents().stream().filter(student -> Double.compare(student.getAverageGrade(), averageGrade) == 0).findFirst().get();
    }

    public Student getStudentWithMaxAverageGrade() {
        return getStudents().stream().max(Comparator.comparingDouble(Student::getAverageGrade)).get();
    }

    public Student getStudentWithMinAverageGrade() {
        return getStudents().stream().min(Comparator.comparingDouble(Student::getAverageGrade)).get();
    }

    public void expel(Student student) {
        students.remove(student);
    }

}