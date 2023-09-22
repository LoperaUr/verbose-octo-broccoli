package com.pgm.verboseoctobroccoli.domain.spi;

import com.pgm.verboseoctobroccoli.domain.model.Product;

import java.util.List;

public interface IProductPersistencePort {

        Product saveProduct(Product product);

        List<Product> getAllProducts();

        Product getProductById(Long id);

}
