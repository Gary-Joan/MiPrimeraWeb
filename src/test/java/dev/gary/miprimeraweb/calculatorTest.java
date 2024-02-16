package dev.gary.miprimeraweb;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class calculatorTest {
    @Test
    void testCalculatorAddFunction(){
        // Given
        int numOne = 10;
        int numTwo = 12;
        int expected = 22;
        CalculatorBraing calcutador = new CalculatorBraing();

        // When
        int result = calcutador.add(numOne,numTwo);
        // Then
        assertEquals(expected, result);
    }
    @Test
    void testCalculatorSubtractFunction() {
        // Given
        int numOne = 20;
        int numTwo = 8;
        int expected = 12;
        CalculatorBraing calculator = new CalculatorBraing();

        // When
        int result = calculator.subtract(numOne, numTwo);

        // Then
        assertEquals(expected, result);
    }
    @Test
    void testCalculatorMultiplyFunction() {
        // Given
        int numOne = 5;
        int numTwo = 6;
        int expected = 30;
        CalculatorBraing calculator = new CalculatorBraing();

        // When
        int result = calculator.multiply(numOne, numTwo);

        // Then
        assertEquals(expected, result);
    }

    @Test
    void testCalculatorDivideFunction() {
        // Given
        int numOne = 50;
        int numTwo = 1000;
        int expected = 5;
        CalculatorBraing calculator = new CalculatorBraing();

        // When
        int result = calculator.divide(numOne, numTwo);

        // Then
        assertEquals(expected, result);
    }
}
