package edu.penzgtu;

import java.time.LocalDate;
import java.time.Period;

public class Student {
    private String name;
    private LocalDate birthDate;
    private String group;
    private int studentId;
    private double averageScore;

    // Constructor
    public Student(String name, LocalDate birthDate, String group, int studentId, double averageScore) {
        this.name = name;
        this.birthDate = birthDate;
        this.group = group;
        this.studentId = studentId;
        this.averageScore = averageScore;
    }

    // Getters
    public int getAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public double getAverageScore() {
        return averageScore;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getStudentId() {
        return studentId;
    }

    // Setters
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isExcellentStudent() {
        return averageScore >= 4.8;
    }

    public String toString() {
        return String.format("Name - %s\nAge - %d\nGroup - %s\nStudent ID - %d\nAverage score - %f",
                name, getAge(), getGroup(), getStudentId(), getAverageScore());
    }

}
