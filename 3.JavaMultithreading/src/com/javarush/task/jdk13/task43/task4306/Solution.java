package com.javarush.task.jdk13.task43.task4306;

/* 
В поиске ботана
*/

//import org.apache.commons.lang3.ObjectUtils;

import org.apache.commons.lang3.ObjectUtils;

import java.util.Objects;

public class Solution {

    public static void main(String[] args) {
        Student studentOne = new Student("Joe", 10, 8, 7, 7, 5, 6, 9);
        Student studentTwo = new Student("Jane", 8, 9, 5, 6, 7, 7, 8);

        String result = compareStudentGrades(studentOne, studentTwo);
        System.out.println(result);
    }

    public static String compareStudentGrades(Student studentOne, Student studentTwo) {

        if (Objects.equals(studentOne.getName(), null) || Objects.equals(studentTwo.getName(), null)) {
            return "Make sure there are no null objects";
        }

        int studentOneTotalScore = calculateScore(studentOne);
        int studentTwoTotalScore = calculateScore(studentTwo);

        int compare = ObjectUtils.compare(studentOneTotalScore, studentTwoTotalScore);

        if (compare > 0) {
            return studentOne.getName() + " has a higher grades score";
        } else if (compare < 0) {
            return studentTwo.getName() + " has a higher grades score";
        } else {
            return "Student grades scores are equal";
        }
    }

    public static int calculateScore(Student student) {
        return student.getMathScore() + student.getPhysicsScore() +
                student.getChemistryScore() + student.getBiologyScore() +
                student.getGeographyScore() + student.getHistoryScore() + student.getEnglishScore();
    }
}


