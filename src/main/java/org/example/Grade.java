package org.example;

import java.time.Instant;
import java.util.ArrayList;

public class Grade {
    private double value;
    private Instant date;
    private ArrayList<GradesHistory> gradesHistory;
    private Student student;
    private Course course;

    public Grade(double value, Instant date, Student student, Course course) {
        this.value = value;
        this.date = date;
        this.student = student;
        this.course = course;
        this.gradesHistory = new ArrayList<>();
    }
    public double getValue() {
        return value;
    }

    public Instant getDate() {
        return date;
    }

    public ArrayList<GradesHistory> getGradesHistory() {
        return gradesHistory;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public void changeGrades(GradesHistory gradesHistory) {
        this.value=gradesHistory.getNewValue();
        this.date=gradesHistory.getNewDate();
        this.gradesHistory.add(gradesHistory);
    }
}
