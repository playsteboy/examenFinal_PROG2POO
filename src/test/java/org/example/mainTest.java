package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;
public class mainTest {
    @BeforeEach
    public void setUp() {

    }
    @Test
    public void mainTest(){
        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.now();
        assertFalse(d1.isBefore(d2));
    }
}
