package com.example;

public class Student {

    public String getGrade(int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100");
        }

        if (marks >= 80) return "A+";
        if (marks >= 70) return "A";
        if (marks >= 60) return "B";
        if (marks >= 50) return "C";
        if (marks >= 40) return "D";
        return "F";
    }

    public boolean isPassed(int marks) {
        return marks >= 40;
    }
}
