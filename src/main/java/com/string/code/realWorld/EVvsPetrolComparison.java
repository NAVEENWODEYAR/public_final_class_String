package com.string.code.realWorld;

import java.util.Scanner;

/**
 * @author Naveen K Wodeyar
 * @date 17-May-2026
 */


//Class to compare EV and Petrol bike running costs
class VehicleCostCalculator {

 // Calculate EV running cost
 static double calculateEVCost(double unitsConsumed, double electricityPrice) {
     return unitsConsumed * electricityPrice;
 }

 // Calculate Petrol bike running cost
 static double calculatePetrolCost(double petrolLitres, double petrolPrice) {
     return petrolLitres * petrolPrice;
 }
}

public class EVvsPetrolComparison {

 // Simple test cases method
 static void runTestCases() {

     System.out.println("===== TEST CASES =====");

     // Test Case 1
     double ev1 = VehicleCostCalculator.calculateEVCost(10, 8);
     double petrol1 = VehicleCostCalculator.calculatePetrolCost(5, 105);

     System.out.println("\nTest Case 1");
     System.out.println("EV Cost      = ₹" + ev1);
     System.out.println("Petrol Cost  = ₹" + petrol1);

     if (ev1 < petrol1) {
         System.out.println("Result: EV is cheaper");
     } else {
         System.out.println("Result: Petrol is cheaper");
     }

     // Test Case 2
     double ev2 = VehicleCostCalculator.calculateEVCost(15, 9);
     double petrol2 = VehicleCostCalculator.calculatePetrolCost(6, 110);

     System.out.println("\nTest Case 2");
     System.out.println("EV Cost      = ₹" + ev2);
     System.out.println("Petrol Cost  = ₹" + petrol2);

     if (ev2 < petrol2) {
         System.out.println("Result: EV is cheaper");
     } else {
         System.out.println("Result: Petrol is cheaper");
     }

     System.out.println("\n======================\n");
 }

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     // Run predefined test cases
     runTestCases();

     System.out.println("===== EV vs Petrol Running Cost Comparison =====");

     // User input for EV
     System.out.print("Enter electricity units consumed for EV: ");
     double units = sc.nextDouble();

     System.out.print("Enter electricity price per unit: ");
     double electricityPrice = sc.nextDouble();

     // User input for Petrol bike
     System.out.print("Enter petrol litres consumed: ");
     double litres = sc.nextDouble();

     System.out.print("Enter petrol price per litre: ");
     double petrolPrice = sc.nextDouble();

     // Calculate costs
     double evCost = VehicleCostCalculator.calculateEVCost(units, electricityPrice);
     double petrolCost = VehicleCostCalculator.calculatePetrolCost(litres, petrolPrice);

     // Display results
     System.out.println("\n===== RESULT =====");
     System.out.println("EV Running Cost      : ₹" + evCost);
     System.out.println("Petrol Running Cost  : ₹" + petrolCost);

     if (evCost < petrolCost) {
         System.out.println("EV vehicle is more economical.");
     } else if (petrolCost < evCost) {
         System.out.println("Petrol vehicle is more economical.");
     } else {
         System.out.println("Both have the same running cost.");
     }

     sc.close();
 }
}