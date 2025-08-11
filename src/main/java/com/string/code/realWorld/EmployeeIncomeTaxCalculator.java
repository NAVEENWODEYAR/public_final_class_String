package com.string.code.realWorld;

import java.util.Scanner;

/**
 * @author Naveen K Wodeyar
 * @date 11-Aug-2025
 */

public class EmployeeIncomeTaxCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input gross annual salary
        System.out.print("Enter your Annual Gross Salary (in INR): ");
        double grossSalary = sc.nextDouble();

        // Input 80C investments (Max allowed is ₹1,50,000)
        System.out.print("Enter your total investments under 80C (in INR): ");
        double sec80CInvestments = sc.nextDouble();
        if (sec80CInvestments > 150000) {
            sec80CInvestments = 150000;
        }

        double standardDeduction = 50000;
        double totalDeductions = standardDeduction + sec80CInvestments;
        double taxableIncome = grossSalary - totalDeductions;

        if (taxableIncome < 0) taxableIncome = 0;

        double incomeTax = calculateIncomeTaxOldRegime(taxableIncome);

        // Apply 4% Health & Education Cess
        double cess = incomeTax * 0.04;
        double totalTaxPayable = incomeTax + cess;

        // TDS per month
        double monthlyTDS = totalTaxPayable / 12;

        // Output
        System.out.println("\n------ INCOME TAX SUMMARY ------");
        System.out.println("Gross Annual Salary: ₹" + grossSalary);
        System.out.println("Standard Deduction: ₹" + standardDeduction);
        System.out.println("Section 80C Deduction: ₹" + sec80CInvestments);
        System.out.println("Taxable Income: ₹" + taxableIncome);
        System.out.println("Income Tax (Before Cess): ₹" + incomeTax);
        System.out.println("Health & Education Cess (4%): ₹" + cess);
        System.out.println("Total Tax Payable: ₹" + totalTaxPayable);
        System.out.println("Monthly TDS Deduction: ₹" + monthlyTDS);

        sc.close();
    }

    public static double calculateIncomeTaxOldRegime(double income) {
        double tax = 0;

        // Section 87A Rebate: If taxable income ≤ ₹5,00,000, rebate of ₹12,500
        if (income <= 250000) {
            tax = 0;
        } else if (income <= 500000) {
            tax = (income - 250000) * 0.05;
            tax -= 12500; // Rebate under 87A
            if (tax < 0) tax = 0;
        } else if (income <= 1000000) {
            tax = (250000 * 0.05) + ((income - 500000) * 0.20);
        } else {
            tax = (250000 * 0.05) + (500000 * 0.20) + ((income - 1000000) * 0.30);
        }

        return tax;
    }
}
