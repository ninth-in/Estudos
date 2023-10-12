/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author CeciliadeFigueiredoF
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    

    /**
     * Test of soma method, of class Calculator.
     */
    @org.junit.jupiter.api.Test
    public void testSoma() {
        System.out.println("soma");
        double number = 8.0;
        double number2 = 2.0;
        double expResult = 10.0;
        double result = Calculator.soma(number, number2);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of sub method, of class Calculator.
     */
    @org.junit.jupiter.api.Test
    public void testSub() {
        System.out.println("sub");
        double number = 8.0;
        double number2 = 2.0;
        double expResult = 6.0;
        double result = Calculator.sub(number, number2);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of div method, of class Calculator.
     */
    @org.junit.jupiter.api.Test
    public void testDiv() {
        System.out.println("div");
        double number = 8.0;
        double number2 = 2.0;
        double expResult = 4.0;
        double result = Calculator.div(number, number2);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of mult method, of class Calculator.
     */
    @org.junit.jupiter.api.Test
    public void testMult() {
        System.out.println("mult");
        double number = 8.0;
        double number2 = 2.0;
        double expResult = 16.0;
        double result = Calculator.mult(number, number2);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of pot method, of class Calculator.
     */
    @org.junit.jupiter.api.Test
    public void testPot() {
        System.out.println("pot");
        double number = 8.0;
        double number2 = 2.0;
        double expResult = 36.0;
        double result = Calculator.pot(number, number2);
        assertEquals(expResult, result, 0);
    }
    
}
