package com.string.code.realWorld;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Naveen K Wodeyar
 * @date 25-Dec-2025
 */

public class GSTCalculator {

    public static Map<String, Double> calculateGST(
            double price,
            double gstRate,
            boolean isInterState,
            double cessRate
    ) {

        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than zero");
        }
        if (gstRate < 0 || cessRate < 0) {
            throw new IllegalArgumentException("Tax rates cannot be negative");
        }

        Map<String, Double> taxMap = new LinkedHashMap<>();

        double cgst = 0;
        double sgst = 0;
        double igst = 0;
        double cess = price * cessRate / 100;

        if (isInterState) {
            igst = price * gstRate / 100;
        } else {
            cgst = price * (gstRate / 2) / 100;
            sgst = price * (gstRate / 2) / 100;
        }

        taxMap.put("CGST", cgst);
        taxMap.put("SGST", sgst);
        taxMap.put("IGST", igst);
        taxMap.put("CESS", cess);

        return taxMap;
    }

    public static double calculateTotalTax(Map<String, Double> taxes) {
        double total = 0;
        for (double tax : taxes.values()) {
            total += tax;
        }
        return total;
    }
}
