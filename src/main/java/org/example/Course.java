package org.example;

import java.util.ArrayList;

public class Course {
    private int id;
    private String label;
    private double credit;
    private Teacher teacher;
    private ArrayList<Exam> exams;

    public Course(int id , String label , double credit, Teacher teacher) {
        this.id = id;
        this.label = label;
        this.credit = credit;
        this.teacher = teacher;
        this.exams = new ArrayList<>();
    }
    public int getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public double getCredit() {
        return credit;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public ArrayList<Exam> getExams() {
        return exams;
    }
}
