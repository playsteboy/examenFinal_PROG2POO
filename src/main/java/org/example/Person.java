package org.example;

import java.time.LocalDate;

public abstract class Person {
    protected final int id;
    protected final String firstname;
    protected final String lastname;
    protected final LocalDate birthdate;
    protected String email;
    protected String phoneNumber;
    public Person(int id, String firstname, String lastname, LocalDate birthdate, String email, String phoneNumber) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

}
