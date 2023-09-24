package com.pgm.verboseoctobroccoli.application.handler;

import com.pgm.verboseoctobroccoli.application.dto.request.ProductRequest;
import com.pgm.verboseoctobroccoli.application.dto.response.ProductResponse;
import com.pgm.verboseoctobroccoli.application.mapper.ProductRequestMapper;
import com.pgm.verboseoctobroccoli.application.mapper.ProductResponseMapper;
import com.pgm.verboseoctobroccoli.domain.api.IProductServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ProductHandler implements IProductHandler {

    private final IProductServicePort productServicePort;
    private final ProductRequestMapper productRequestMapper;
    private final ProductResponseMapper productResponseMapper;

    @Override
    public ProductResponse saveProduct(ProductRequest productRequest) {
        var product = productServicePort.saveProduct(productRequestMapper.toModel(productRequest));
        return productResponseMapper.toResponse(product);
    }

    @Override
    public List<ProductResponse> getAllProducts() {
        return productResponseMapper.toResponseList(productServicePort.getAllProducts());
    }

    @Override
    public ProductResponse getProductById(Long id) {
        return productResponseMapper.toResponse(productServicePort.getProductById(id));
    }
}
