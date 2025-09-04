package org.example;

import java.time.LocalDate;

public class Teacher extends Person {
    private String specialty;
    public Teacher(int id, String firstname, String lastname, LocalDate birthdate, String email, String phoneNumber, String specialty) {
        super(id, firstname, lastname, birthdate, email, phoneNumber);
        this.specialty = specialty;
    }
}
