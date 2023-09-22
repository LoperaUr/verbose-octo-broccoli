package com.pgm.verboseoctobroccoli.domain.util;

import com.pgm.verboseoctobroccoli.domain.model.Category;

public class ValidateCategory {
    private ValidateCategory () {}


    public static boolean isValidReqBody(Category category) {
        return category.getName() == null || category.getName().length() < 3 || category.getDescription() == null || category.getDescription().length() < 5;
    }
}
