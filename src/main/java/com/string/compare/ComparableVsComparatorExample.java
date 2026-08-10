/**
 * @author Naveen K Wodeyar
 * @date 10-Aug-2026
 */
package com.string.compare;

import java.util.*;

// Car class implements Comparable
// Comparable is used for natural/default sorting
class Car implements Comparable<Car> {

    private String model;
    private int price;
    private int year;

    // Constructor
    public Car(String model, int price, int year) {
        this.model = model;
        this.price = price;
        this.year = year;
    }

    // Getter methods
    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    // Comparable
    // Default sorting: by price
    @Override
    public int compareTo(Car other) {
        return Integer.compare(this.price, other.price);
    }

    @Override
    public String toString() {
        return model + " - " + price + " - " + year;
    }
}


// Comparator for sorting Cars by model name
class CarModelComparator implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2) {
        return car1.getModel().compareTo(car2.getModel());
    }
}


// Comparator for sorting Cars by year
class CarYearComparator implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2) {
        return Integer.compare(car1.getYear(), car2.getYear());
    }
}


// Main class
public class ComparableVsComparatorExample {

    public static void main(String[] args) {

        // Creating a list of Cars
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("BMW", 5000000, 2022));
        cars.add(new Car("Audi", 4000000, 2020));
        cars.add(new Car("Tata", 1500000, 2024));
        cars.add(new Car("Honda", 2000000, 2021));


        // =================================================
        // COMPARABLE
        // =================================================

        System.out.println("Cars sorted by PRICE (Comparable):");

        // No Comparator is passed.
        // Java uses the compareTo() method from Car class.
        Collections.sort(cars);

        for (Car car : cars) {
            System.out.println(car);
        }


        // =================================================
        // COMPARATOR - SORT BY MODEL
        // =================================================

        System.out.println("\nCars sorted by MODEL (Comparator):");

        // Passing CarModelComparator separately.
        Collections.sort(cars, new CarModelComparator());

        for (Car car : cars) {
            System.out.println(car);
        }


        // =================================================
        // COMPARATOR - SORT BY YEAR
        // =================================================

        System.out.println("\nCars sorted by YEAR (Comparator):");

        // Passing another Comparator.
        Collections.sort(cars, new CarYearComparator());

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}