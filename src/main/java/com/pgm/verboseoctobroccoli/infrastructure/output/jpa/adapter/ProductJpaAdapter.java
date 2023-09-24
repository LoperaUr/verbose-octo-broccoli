package com.pgm.verboseoctobroccoli.infrastructure.output.jpa.adapter;

import com.pgm.verboseoctobroccoli.domain.exception.UserNotFoundException;
import com.pgm.verboseoctobroccoli.domain.model.Product;
import com.pgm.verboseoctobroccoli.domain.spi.IProductPersistencePort;
import com.pgm.verboseoctobroccoli.infrastructure.output.jpa.mapper.ProductEntityMapper;
import com.pgm.verboseoctobroccoli.infrastructure.output.jpa.repository.IProductRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ProductJpaAdapter implements IProductPersistencePort {

    private final IProductRepository productRepository;
    private final ProductEntityMapper productEntityMapper;

    @Override
    public Product saveProduct(Product product) {
        var productEntity = productRepository.save(productEntityMapper.toEntity(product));
        return productEntityMapper.toModel(productEntity);
    }

    @Override
    public List<Product> getAllProducts() {
        var productsFounded = productRepository.findAll();
        if (productsFounded.isEmpty()) {
            throw new UserNotFoundException();
        }
        return productEntityMapper.toModelList(productsFounded);

    }

    @Override
    public Product getProductById(Long id) {
        var productFounded = productRepository.findById(id);
        if (productFounded.isEmpty()) {
            throw new UserNotFoundException();
        }
        return productEntityMapper.toModel(productFounded.get());
    }
}
