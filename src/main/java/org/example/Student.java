package org.example;

import java.time.LocalDate;
import java.util.ArrayList;

public class Student extends Person{
    private String group;
    private final Tutor tutor;
    private ArrayList<Grade> grades;
    public Student(int id,
                   String firstname,
                   String lastname,
                   LocalDate birthdate,
                   String email,
                   String phoneNumber,
                   String group,
                   Tutor tutor)
    {
        super(id,firstname,lastname,birthdate,email,phoneNumber);
        this.group=group;
        this.tutor=tutor;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }
}
