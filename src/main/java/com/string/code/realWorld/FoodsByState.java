package com.string.code.realWorld;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Naveen K Wodeyar
 * @date 23-Jan-2026
 */

public class FoodsByState {
    public static void main(String[] args) {

        Map<String, String[]> stateFoods = new HashMap<>();

        stateFoods.put("Tamil Nadu", new String[]{
                "Idli", "Dosa", "Sambar", "Pongal"
        });

        stateFoods.put("Punjab", new String[]{
                "Butter Chicken", "Chole Bhature", "Makki di Roti", "Sarson da Saag"
        });

        stateFoods.put("West Bengal", new String[]{
                "Machher Jhol", "Mishti Doi", "Rosogolla"
        });

        stateFoods.put("Rajasthan", new String[]{
                "Dal Baati Churma", "Gatte ki Sabzi", "Ker Sangri"
        });

        stateFoods.put("Maharashtra", new String[]{
                "Vada Pav", "Pav Bhaji", "Misal Pav", "Puran Poli"
        });

        System.out.println("🍽️ Foods by Indian State");
        System.out.println("------------------------");

        for (String state : stateFoods.keySet()) {
            System.out.println("\n📍 " + state + ":");
            for (String food : stateFoods.get(state)) {
                System.out.println("  • " + food);
            }
        }
    }
}
