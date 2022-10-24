package org.example;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class CalculatorTest {
    private static int NUMBER = 0;

    @Test
    void flake() {
        ++NUMBER;
        assertEquals(2, NUMBER);
    }

    @Test
    void add() {
        assertEquals(1 + 2, Calculator.add(1, 2));
        assertEquals(4 + 5, Calculator.add(4, 5));
    }

    @Disabled
    @Test
    void fails() {
        fail();
    }
}