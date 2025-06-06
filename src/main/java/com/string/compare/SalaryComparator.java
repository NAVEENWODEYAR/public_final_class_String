package com.string.compare;

import java.util.Comparator;

/**
 * @author Naveen K Wodeyar
 * @date 06-Jun-2025
 */

public class SalaryComparator implements Comparator<PersonEntity> {

    @Override
    public int compare(PersonEntity p1, PersonEntity p2) {
        int salaryCompare = Double.compare(p2.getSalary(), p1.getSalary()); // Descending
        if (salaryCompare != 0) {
            return salaryCompare;
        } else {
            return Integer.compare(p1.getAge(), p2.getAge()); // Ascending
        }
    }
}
