package org.sever;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {
    public static CalculatorService calc=new CalculatorService();
    @Test
    void checkPositive() {

        assertEquals(true,calc.checkPositive(3));
    }

    @Test
    void checkNegative() {

        assertEquals(true,calc.checkNegative(-3));
    }

    @Test
    void checkEvenNumber() {
        assertEquals(true,calc.checkEvenNumber(2));
    }

    @Test
    void checkOddNumber() {
        assertEquals(true,calc.checkOddNumber(7));
    }

    @Test
    void checkWhetherPrimeOrNot() {
        assertEquals(true,calc.checkWhetherPrimeOrNot(7));
    }
}