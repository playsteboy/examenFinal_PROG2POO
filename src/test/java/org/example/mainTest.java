package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.GenericArrayType;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

public class mainTest {
    private Tutor t1;
    private Student s1;
    private Teacher te1;
    private Course c1;
    private Grade g1;

    @BeforeEach
    public void setUp() {
        t1 = new Tutor(1,"kri",
                "pok",
                LocalDate.parse("19/04/1965", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                "kriPok@gmail.com",
                "15 1549 465",
                "real near of my child"
                );
        s1 = new Student(1,"juir"
                ,"pok"
                ,LocalDate.parse("12/02/2000", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                "pok@gmail.com",
                "235 158 45",
                "k1",
                t1
                );
        te1 = new Teacher(2,
                "toky",
                "Ramaro",
                LocalDate.parse("19/11/1985", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                "Toky@gmail.com",
                "466 4578 12",
                "full stack"
                );
        c1 = new Course(1,"Porg2",4,te1);
        g1 = new Grade(15.00,Instant.parse("2020-04-20T00:00:00.00Z"),
                s1,
                c1);
        s1.getGrades().add(g1);
    }
    @Test
    public void examGradesTest(){
        Exam e1 = new Exam(c1,
                "examen Prog2",
                LocalDate.parse("19/04/2000", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                2
                );
        assertEquals(15,e1.getExamGrade(e1,s1,Instant.parse("2020-03-20T00:00:00.00Z")));
    }
    public void corseGradesTest(){
        Exam e1 = new Exam(c1,
                "examen Prog2",
                LocalDate.parse("19/04/2000", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                2
        );
        assertEquals(15.00,e1.getCourseGrade(c1,s1,Instant.parse("2020-04-20T00:00:00.00Z")));
    }
}
