package com.library;

import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CalculatorAAATest {

    private Calculator calculator;

    @Before
    public void setUp() {

        System.out.println("Setting up Calculator...");

        calculator = new Calculator();
    }

    @Test
    public void testAddition() {

        int a = 10;
        int b = 20;

        int result = calculator.add(a, b);

        assertEquals(30, result);

        System.out.println("Addition Test Passed");

    }

    @After
    public void tearDown() {

        System.out.println("Cleaning up...");

        calculator = null;
    }
}