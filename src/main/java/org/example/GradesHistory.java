package org.example;

import java.time.Instant;

public class GradesHistory {
    private double newValue;
    private Instant newDate;
    private String reason;
    public GradesHistory(double newValue, Instant newDate, String reason) {
        this.newValue = newValue;
        this.newDate = newDate;
        this.reason = reason;
    }

    public double getNewValue() {
        return newValue;
    }

    public Instant getNewDate() {
        return newDate;
    }

    public String getReason() {
        return reason;
    }
}
