package com.pgm.verboseoctobroccoli.application.handler;

import com.pgm.verboseoctobroccoli.application.dto.request.ProductRequest;
import com.pgm.verboseoctobroccoli.application.dto.response.ProductResponse;

import java.util.List;

public interface IProductHandler {
    ProductResponse saveProduct(ProductRequest productRequest);

    List<ProductResponse> getAllProducts();

    ProductResponse getProductById(Long id);

}
