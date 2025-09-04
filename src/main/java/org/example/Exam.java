package org.example;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;

public class Exam {
    private Course course;
    private String title;
    private LocalDate date;
    private double coefficient;

    public Exam(Course course, String title, LocalDate date, double coefficient) {
        this.course = course;
        this.title = title;
        this.date = date;
        this.coefficient = coefficient;
    }
    public double getExamGrade(Exam exam, Student student, Instant t) {
        for(Grade grade : student.getGrades()){
            if(grade.getDate().isAfter(t) && grade.getCourse().getLabel().equals(exam.course.getLabel())){
                return grade.getValue()*exam.coefficient;
            }
        }
        throw new IllegalArgumentException("verify that the exam has the same label of course as the grade's course");
    }
    public double getCourseGrade(Course course, Student student, Instant t){
        double result = 0.0;
        ArrayList<Double> grades = new ArrayList<>();
        for(Grade grade : student.getGrades()){
            if(grade.getDate().isAfter(t) && grade.getCourse().getLabel().equals(course.getLabel())){
                grades.add(grade.getValue());
            }
            else{
                throw new IllegalArgumentException("verify that the course has the same label as the grade's course");
            }
        }
        for(double grade : grades){
            result +=(grade*coefficient);
        }
        ArrayList<Double> coefficients = new ArrayList<>();
        for(Exam exam: course.getExams()){
            coefficients.add(exam.coefficient);
        }
        double totalCoefficient = 0.0;
        for(double coefficient: coefficients){
            totalCoefficient += coefficient;
        }
        return result/totalCoefficient;
    }

    public Course getCourse() {
        return course;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getCoefficient() {
        return coefficient;
    }
}
