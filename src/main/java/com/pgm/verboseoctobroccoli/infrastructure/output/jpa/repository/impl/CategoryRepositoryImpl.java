package com.pgm.verboseoctobroccoli.infrastructure.output.jpa.repository.impl;

import com.pgm.verboseoctobroccoli.domain.spi.repo.CategoryRepository;
import com.pgm.verboseoctobroccoli.infrastructure.output.jpa.repository.ICategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class CategoryRepositoryImpl implements CategoryRepository {

    private final ICategoryRepository categoryRepository;


    @Override
    public boolean existsByName(String name) {
        return categoryRepository.existsByName(name);
    }
}
