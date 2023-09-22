package com.pgm.verboseoctobroccoli.domain.util;

import com.pgm.verboseoctobroccoli.domain.model.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationUser {
    private ValidationUser() {
    }

    private static final String EMAIL_REGEX = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    private static final String PASSWORD_REGEX = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
    private static final Pattern PASSWORD_PATTERN = Pattern.compile(PASSWORD_REGEX);

    public static boolean isValidEmailStructure(String email) {
        Matcher matcher = EMAIL_PATTERN.matcher(email);
        return !matcher.matches();
    }

    public static boolean isValidPasswordStructure(String password) {
        Matcher matcher = PASSWORD_PATTERN.matcher(password);
        return !matcher.matches();
    }

    public static boolean isValidRole(User user) {
        return user.getRole() != 1L && user.getRole() != 2L;
    }

    public static boolean isValidReqBody(User user) {
        return user.getName().length() < 3 || user.getName() == null || user.getEmail() == null || user.getPassword() == null;
    }
}
