package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    @Test
    void add() {
        assertEquals(1 + 2, Calculator.add(1, 2));
        assertEquals(4 + 5, Calculator.add(4, 5));
    }
}