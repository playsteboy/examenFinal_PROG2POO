package org.example;

import java.time.LocalDate;

public class Tutor extends Person{
    private String description;
    Tutor(int id, String firstname, String lastname, LocalDate birthdate, String email, String phoneNumber, String description) {
        super(id,firstname,lastname,birthdate,email,phoneNumber);
        this.description=description;
    }
}
