package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class University {

    private String name;
    private int age;
    private List<Student> students = new ArrayList<>();

    public University(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    //вернет студента с заданным баллом
    public Student getStudentWithAverageGrade(double averageGrade) {
        return getStudents().stream().filter(student -> Double.compare(student.getAverageGrade(), averageGrade) == 0).findFirst().get();
    }

    //вернет студента с максимальным средним баллом
    public Student getStudentWithMaxAverageGrade() {
        return getStudents().stream().max(Comparator.comparingDouble(Student::getAverageGrade)).get();
    }

    //вернет студента с минимальным средним баллом
    public Student getStudentWithMinAverageGrade() {
        return getStudents().stream().min(Comparator.comparingDouble(Student::getAverageGrade)).get();
    }

    public void expel(Student student) {
       students.remove(student);
    }

}