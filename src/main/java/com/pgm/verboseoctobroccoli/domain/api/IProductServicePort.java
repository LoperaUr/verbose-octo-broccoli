package com.pgm.verboseoctobroccoli.domain.api;

import com.pgm.verboseoctobroccoli.domain.model.Product;

import java.util.List;

public interface IProductServicePort {
    Product saveProduct(Product product);

    List<Product> getAllProducts();

    Product getProductById(Long id);

}
