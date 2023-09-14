package com.pgm.verboseoctobroccoli.domain.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationUser {
    private ValidationUser() {
    }
    private static final String EMAIL_REGEX = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    private static final String PASSWORD_REGEX = "^[^@]+@[^@]+\\.[a-zA-Z]{2,}$";

    private static final Pattern PASSWORD_PATTERN = Pattern.compile(PASSWORD_REGEX);

    public static boolean isValidEmailStructure(String email) {
        Matcher matcher = EMAIL_PATTERN.matcher(email);
        return !matcher.matches();
    }

    public static boolean isValidPasswordStructure(String password) {
        Matcher matcher = PASSWORD_PATTERN.matcher(password);
        return !matcher.matches();
    }
}
