package com.string.code;

import java.util.HashMap;

/**
 * @author Naveen K Wodeyar
 * @date 07-May-2025
 */

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);

            if (mapST.containsKey(cs)) {
                if (mapST.get(cs) != ct) return false;
            } else {
                mapST.put(cs, ct);
            }

            if (mapTS.containsKey(ct)) {
                if (mapTS.get(ct) != cs) return false;
            } else {
                mapTS.put(ct, cs);
            }
        }

        return true;
    }

    public static void main(String[] args) {
    	IsomorphicStrings isomorPihic = new IsomorphicStrings();
        System.out.println(isomorPihic.isIsomorphic("egg", "add"));  // Output: true
        System.out.println(isomorPihic.isIsomorphic("foo", "bar"));  // Output: true
        System.out.println(isomorPihic.isIsomorphic("paper", "title"));  // Output: true
    }
}

