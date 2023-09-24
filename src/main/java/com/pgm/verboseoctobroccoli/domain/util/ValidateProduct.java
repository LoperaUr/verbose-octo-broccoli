package com.pgm.verboseoctobroccoli.domain.util;

import com.pgm.verboseoctobroccoli.domain.model.Product;

public class ValidateProduct {
    private ValidateProduct() {
    }


    public static boolean isValidReqBody(Product product) {
        return product.getName().length() < 4 || product.getName() == null ||
                product.getDescription().length() < 4 || product.getDescription() == null ||
                product.getUrlImage().length() < 4 || product.getUrlImage() == null;
    }

    public static boolean isValidPrice(Double price) {
        return price < 10;
    }

    public static boolean isValidStock(Long stock) {
        return stock < 1;
    }
}
