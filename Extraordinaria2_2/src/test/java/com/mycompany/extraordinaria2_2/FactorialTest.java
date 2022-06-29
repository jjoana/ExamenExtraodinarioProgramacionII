/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.extraordinaria2_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jesus
 */
public class FactorialTest {

    Factorial factorial = new Factorial();

    /**
     * Test of factorialRecursivo method, of class Factorial.
     */
    @Test
    public void testFactorialRecursivo() {
        assertEquals(6, factorial.factorialRecursivo(3));
        assertEquals(2, factorial.factorialRecursivo(2));
    }

    /**
     * Test of factorialIterativo method, of class Factorial.
     */
    @Test
    public void testFactorialIterativo() {
        assertEquals(6, factorial.factorialIterativo(3));
        assertEquals(2, factorial.factorialIterativo(2));
    }

}
