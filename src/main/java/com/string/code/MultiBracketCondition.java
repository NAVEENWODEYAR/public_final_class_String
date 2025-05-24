package com.string.code;

/**
 * @author Naveen K Wodeyar
 * @date 23-May-2025
 */

public class MultiBracketCondition {
    public static void main(String[] args) {
        int age = 20;
        boolean hasLicense = true;
        boolean withGuardian = false;
        boolean hasPermissionSlip = true;

        // Example 1: Without proper brackets (may work but confusing)
        if (age >= 18 && hasLicense || withGuardian)
            System.out.println("Allowed (but ambiguous logic!)");

        // Example 2: Clear logic with proper brackets
        if ((age >= 18 && hasLicense) || withGuardian)
            System.out.println("Allowed: Adult with license OR with guardian");

        // Example 3: Different logic: age is enough, if any of license or guardian present
        if (age >= 18 && (hasLicense || withGuardian))
            System.out.println("Allowed: Adult with license OR guardian (different logic)");

        // Example 4: More complex - must be adult with license or minor with guardian and permission
        if ((age >= 18 && hasLicense) || (age < 18 && withGuardian && hasPermissionSlip)) {
            System.out.println("Allowed: Adult with license OR minor with guardian & permission");
        } else {
            System.out.println("Access Denied: Requirements not met");
        }
    }
}
