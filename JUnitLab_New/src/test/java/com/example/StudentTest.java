package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    private final Student student = new Student();

    @Test
    void studentScoring85GetsAPlus() {
        assertEquals("A+", student.getGrade(85));
    }

    @Test
    void studentScoring75GetsA() {
        assertEquals("A", student.getGrade(75));
    }

    @Test
    void studentScoring55GetsC() {
        assertEquals("C", student.getGrade(55));
    }

    @Test
    void studentScoring35GetsF() {
        assertEquals("F", student.getGrade(35));
    }

    @Test
    void studentScoring40Passes() {
        assertTrue(student.isPassed(40));
    }

    @Test
    void studentScoring39Fails() {
        assertFalse(student.isPassed(39));
    }

    @Test
    void marksAbove100AreRejected() {
        assertThrows(IllegalArgumentException.class, () -> student.getGrade(101));
    }

    @Test
    void negativeMarksAreRejected() {
        assertThrows(IllegalArgumentException.class, () -> student.getGrade(-1));
    }
}
