package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(30, calculator.add(10, 20));
    }

    @Test
    void testSubtraction() {
        assertEquals(10, calculator.subtract(20, 10));
    }

    @Test
    void testMultiplication() {
        assertEquals(200, calculator.multiply(20, 10));
    }

    @Test
    void testDivision() {
        assertEquals(5.0, calculator.divide(20, 4), 0.000001);
    }

    // Exercise 1: additional calculator test cases
    @Test
    void testAddingTwoNegativeNumbers() {
        assertEquals(-15, calculator.add(-7, -8));
    }

    @Test
    void testAddingZero() {
        assertEquals(12, calculator.add(12, 0));
    }

    @Test
    void testMultiplyingByZero() {
        assertEquals(0, calculator.multiply(9, 0));
    }

    @Test
    void testSubtractingLargerNumberFromSmaller() {
        assertEquals(-6, calculator.subtract(4, 10));
    }

    @Test
    void testDivisionWithDecimalResult() {
        assertEquals(2.5, calculator.divide(5, 2), 0.000001);
    }

    // Lab Task 8: additional assertions
    @Test
    void testNotEquals() {
        assertNotEquals(100, calculator.add(10, 20));
    }

    @Test
    void testTrue() {
        assertTrue(calculator.multiply(5, 5) == 25);
    }

    @Test
    void testFalse() {
        assertFalse(calculator.add(5, 5) == 20);
    }

    @Test
    void testNotNull() {
        assertNotNull(calculator);
    }
}
