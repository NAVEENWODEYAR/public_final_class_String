package com.string.code;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Naveen K Wodeyar
 * @date 18-Oct-2025
 */

public final class MaskUtils {

    private static final char DEFAULT_MASK_CHAR = '*';

    private MaskUtils() { /* no instantiation */ }

    /* -----------------------
       Public convenience API
       ----------------------- */

    public static String maskEmail(String email) {
        return maskEmail(email, DEFAULT_MASK_CHAR);
    }

    public static String maskUsername(String username) {
        return maskUsername(username, DEFAULT_MASK_CHAR);
    }

    public static String maskPassword(String password) {
        return maskPassword(password, DEFAULT_MASK_CHAR);
    }

    public static String maskPhone(String phone) {
        return maskPhone(phone, DEFAULT_MASK_CHAR);
    }

    public static String maskCreditCard(String cc) {
        return maskCreditCard(cc, DEFAULT_MASK_CHAR);
    }

    public static String maskSSN(String ssn) {
        return maskSSN(ssn, DEFAULT_MASK_CHAR);
    }

    /**
     * Finds likely sensitive elements in free text and masks them.
     * It looks for emails, phone-like numbers, credit-card-like numbers, and SSN (US).
     * Order matters: mask long tokens (credit cards) before more permissive phone regexp.
     */
    public static String maskInText(String text) {
        return maskInText(text, DEFAULT_MASK_CHAR);
    }

    /* -----------------------
       Implementations
       ----------------------- */

    public static String maskEmail(String email, char maskChar) {
        if (email == null || email.isEmpty()) return email;
        // Split local@domain
        int at = email.indexOf('@');
        if (at <= 0) return maskAll(email, maskChar); // fallback
        String local = email.substring(0, at);
        String domain = email.substring(at + 1);

        // keep first and last char of local if long enough, else keep first char
        String maskedLocal;
        if (local.length() <= 2) {
            maskedLocal = repeat(maskChar, Math.max(1, local.length()));
        } else {
            maskedLocal = local.charAt(0)
                    + repeat(maskChar, Math.max(1, local.length() - 2))
                    + local.charAt(local.length() - 1);
        }
        return maskedLocal + "@" + domain;
    }

    public static String maskUsername(String username, char maskChar) {
        if (username == null || username.isEmpty()) return username;
        // keep first and last char if length >=3, else mask fully with at least one char
        if (username.length() == 1) return String.valueOf(maskChar);
        if (username.length() == 2) return username.charAt(0) + String.valueOf(maskChar);
        return username.charAt(0) + repeat(maskChar, username.length() - 2) + username.charAt(username.length() - 1);
    }

    public static String maskPassword(String password, char maskChar) {
        if (password == null) return null;
        // For logging, do NOT reveal length. Use fixed 8 mask chars (or at least something)
        int displayLen = 8;
        return repeat(maskChar, displayLen);
    }

    public static String maskPhone(String phone, char maskChar) {
        if (phone == null || phone.isEmpty()) return phone;
        // keep last 4 digits, mask the rest of digits; preserve non-digit formatting (spaces, dashes, parentheses)
        StringBuilder out = new StringBuilder();
        int digitCount = 0;
        for (int i = phone.length() - 1; i >= 0; i--) {
            char c = phone.charAt(i);
            if (Character.isDigit(c)) digitCount++;
        }
        int keepDigits = Math.min(4, digitCount);
        int digitsSeen = 0;
        // iterate forward and build result
        for (int i = 0; i < phone.length(); i++) {
            char c = phone.charAt(i);
            if (Character.isDigit(c)) {
                if (digitsSeen < (digitCount - keepDigits)) {
                    out.append(maskChar);
                } else {
                    out.append(c);
                }
                digitsSeen++;
            } else {
                out.append(c);
            }
        }
        return out.toString();
    }

    public static String maskCreditCard(String cc, char maskChar) {
        if (cc == null || cc.isEmpty()) return cc;
        // Keep last 4 digits of credit card, mask digits; preserve separators
        StringBuilder out = new StringBuilder();
        int digitCount = 0;
        for (int i = cc.length() - 1; i >= 0; i--) if (Character.isDigit(cc.charAt(i))) digitCount++;
        int keepDigits = Math.min(4, digitCount);
        int digitsSeen = 0;
        for (int i = 0; i < cc.length(); i++) {
            char c = cc.charAt(i);
            if (Character.isDigit(c)) {
                if (digitsSeen < (digitCount - keepDigits)) out.append(maskChar);
                else out.append(c);
                digitsSeen++;
            } else {
                out.append(c);
            }
        }
        return out.toString();
    }

    public static String maskSSN(String ssn, char maskChar) {
        if (ssn == null || ssn.isEmpty()) return ssn;
        // Expect formats like 123-45-6789 or 123456789
        // Keep last 4 digits
        String digitsOnly = ssn.replaceAll("\\D", "");
        if (digitsOnly.length() < 4) return repeat(maskChar, ssn.length());
        String last4 = digitsOnly.substring(digitsOnly.length() - 4);
        // Return as masked digits except last 4, keeping dashes if present
        StringBuilder out = new StringBuilder();
        int digitsSeen = 0;
        int toKeepPrefix = digitsOnly.length() - 4;
        for (int i = 0; i < ssn.length(); i++) {
            char c = ssn.charAt(i);
            if (Character.isDigit(c)) {
                if (digitsSeen < toKeepPrefix) out.append(maskChar);
                else out.append(c);
                digitsSeen++;
            } else {
                out.append(c);
            }
        }
        return out.toString();
    }

    /* -----------------------
       Masking within text
       ----------------------- */

    public static String maskInText(String text, char maskChar) {
        if (text == null || text.isEmpty()) return text;

        String result = text;

        // 1) Credit card-like: sequences of 13-19 digits optionally separated by spaces/dashes
        Pattern ccPattern = Pattern.compile("\\b(?:\\d[ -]*?){13,19}\\b");
        result = replaceWithFunction(result, ccPattern,
                m -> maskCreditCard(m.group(), maskChar));

        // 2) SSN (US): 123-45-6789 or 123456789
        Pattern ssnPattern = Pattern.compile("\\b\\d{3}-\\d{2}-\\d{4}\\b|\\b\\d{9}\\b");
        result = replaceWithFunction(result, ssnPattern,
                m -> maskSSN(m.group(), maskChar));

        // 3) Emails
        Pattern emailPattern = Pattern.compile(
                "\\b[\\w+._%\\-+]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}\\b");
        result = replaceWithFunction(result, emailPattern,
                m -> maskEmail(m.group(), maskChar));

        // 4) Phone-like numbers (international-ish): +1 555-555-5555, (555) 555 5555, 555-5555 etc.
        Pattern phonePattern = Pattern.compile(
                "(?:\\+?\\d{1,3}[\\s-]?)?(?:\\(\\d{2,4}\\)[\\s-]?|\\d{2,4}[\\s-])?\\d{3,4}[\\s-]?\\d{3,4}");
        result = replaceWithFunction(result, phonePattern,
                m -> {
                    String g = m.group();
                    // avoid masking short things that are not phone numbers (e.g., years) by checking count of digits
                    int digits = countDigits(g);
                    if (digits < 7) return g; // skip likely non-phone small numbers
                    return maskPhone(g, maskChar);
                });

        // 5) Generic username inside quotes or after 'user=' etc - optional: simple pattern user=someone or "username": "bob"
        Pattern userPattern = Pattern.compile("(?i)(?:user(?:name)?\\s*[:=]\\s*['\"]?)([\\w.@+-]{1,64})['\"]?");
        result = replaceWithFunction(result, userPattern,
                m -> {
                    // m.group(0) contains prefix + username. Replace only the captured username keeping prefix.
                    String full = m.group(0);
                    String u = m.group(1);
                    String masked = maskUsername(u, maskChar);
                    return full.replace(u, masked);
                });

        // 6) Generic password patterns: password=secret (mask entirely)
        Pattern pwdPattern = Pattern.compile("(?i)(?:password\\s*[:=]\\s*['\"]?)([^\\s'\",;]+)['\"]?");
        result = replaceWithFunction(result, pwdPattern,
                m -> {
                    String full = m.group(0);
                    String p = m.group(1);
                    String masked = maskPassword(p, maskChar);
                    return full.replace(p, masked);
                });

        return result;
    }

    /* -----------------------
       Helpers
       ----------------------- */

    private static String replaceWithFunction(String input, Pattern pattern, ReplaceFunc func) {
        Matcher m = pattern.matcher(input);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            String replacement = func.apply(m);
            // quote for literal replacement
            m.appendReplacement(sb, Matcher.quoteReplacement(replacement));
        }
        m.appendTail(sb);
        return sb.toString();
    }

    private interface ReplaceFunc {
        String apply(Matcher m);
    }

    private static String repeat(char c, int n) {
        if (n <= 0) return "";
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) sb.append(c);
        return sb.toString();
    }

    private static String maskAll(String s, char maskChar) {
        return repeat(maskChar, s.length());
    }

    private static int countDigits(String s) {
        int count = 0;
        for (char c : s.toCharArray()) if (Character.isDigit(c)) count++;
        return count;
    }

    /* -----------------------
       Simple demo / tests
       ----------------------- */

    public static void main(String[] args) {
        System.out.println("=== Individual masks ===");
        System.out.println("Email: " + maskEmail("john.doe@example.com"));
        System.out.println("Short email: " + maskEmail("ab@example.com"));
        System.out.println("Username: " + maskUsername("alice"));
        System.out.println("Username2: " + maskUsername("ab"));
        System.out.println("Password: " + maskPassword("mySuperSecret123"));
        System.out.println("Phone: " + maskPhone("+1 (555) 123-4567"));
        System.out.println("Phone2: " + maskPhone("555-12-345"));
        System.out.println("CC: " + maskCreditCard("4111 1111 1111 1111"));
        System.out.println("SSN: " + maskSSN("123-45-6789"));

        System.out.println("\n=== maskInText ===");
        String text = "User: alice, email: john.doe@example.com, phone: +1-555-123-4567, cc: 4111-1111-1111-1111, ssn: 123-45-6789, password=secret123";
        System.out.println(maskInText(text));
    }
}
