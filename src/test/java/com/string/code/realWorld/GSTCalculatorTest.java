package com.string.code.realWorld;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Map;
import org.junit.jupiter.api.Test;

/**
 * @author Naveen K Wodeyar
 * @date 25-Dec-2025
 */

public class GSTCalculatorTest {

    @Test
    void testIntraStateGST() {
        Map<String, Double> taxes =
                GSTCalculator.calculateGST(1000, 18, false, 0);

        assertEquals(90.0, taxes.get("CGST"));
        assertEquals(90.0, taxes.get("SGST"));
        assertEquals(0.0, taxes.get("IGST"));
        assertEquals(0.0, taxes.get("CESS"));
    }

    @Test
    void testInterStateGST() {
        Map<String, Double> taxes =
                GSTCalculator.calculateGST(1000, 18, true, 0);

        assertEquals(0.0, taxes.get("CGST"));
        assertEquals(0.0, taxes.get("SGST"));
        assertEquals(180.0, taxes.get("IGST"));
    }

    @Test
    void testGSTWithCess() {
        Map<String, Double> taxes =
                GSTCalculator.calculateGST(1000, 18, false, 2);

        assertEquals(20.0, taxes.get("CESS"));
    }

    @Test
    void testTotalTaxCalculation() {
        Map<String, Double> taxes =
                GSTCalculator.calculateGST(1000, 18, false, 0);

        double totalTax = GSTCalculator.calculateTotalTax(taxes);
        assertEquals(180.0, totalTax);
    }

    @Test
    void testInvalidPrice() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> GSTCalculator.calculateGST(-100, 18, false, 0)
        );

        assertEquals("Price must be greater than zero", exception.getMessage());
    }

    @Test
    void testNegativeGSTRate() {
        assertThrows(
                IllegalArgumentException.class,
                () -> GSTCalculator.calculateGST(1000, -5, false, 0)
        );
    }
}
