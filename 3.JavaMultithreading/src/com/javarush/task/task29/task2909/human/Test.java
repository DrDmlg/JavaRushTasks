package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        University university = new University("One", 15);

        List<Student> students = new ArrayList<>();
        students.add(new Student("Dmitriy", 28, 5.9d));
        students.add(new Student("Alexey", 35, 3.7d));
        students.add(new Student("Vladimir", 24, 1.3d));
        university.setStudents(students);

        List<Student> students1 = university.getStudents();
        students1.forEach(st -> System.out.printf("%s %d %.2f%n", st.getName(), st.getAge(), st.getAverageGrade()));

        StudentsDataBase.removeStudent(1);

        students1.forEach(st -> System.out.printf("%s %d %.2f%n", st.getName(), st.getAge(), st.getAverageGrade()));


//        Student student = new Student("Alexey", 35, 3.7d);
//        university.expel(student);
//        System.out.println("------");
//        students1.forEach(st -> System.out.printf("%s %d %.2f%n", st.getName(), st.getAge(), st.getAverageGrade()));
//



        // Student saw = university.getStudentWithAverageGrade(5.9);
        //Student saw = university.getStudentWithMaxAverageGrade();
        //Student saw = university.getStudentWithMinAverageGrade();


        // System.out.printf("%s %d %.2f", saw.getName(), saw.getAge(), saw.getAverageGrade());
    }
}
