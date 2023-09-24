package com.pgm.verboseoctobroccoli.infrastructure.output.jpa.repository.impl;

import com.pgm.verboseoctobroccoli.domain.spi.repo.ProductRepository;
import com.pgm.verboseoctobroccoli.infrastructure.output.jpa.repository.IProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private final IProductRepository productRepository;

    @Override
    public boolean existsByName(String name) {
        return productRepository.existsByName(name);
    }
}
