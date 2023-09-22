package com.pgm.verboseoctobroccoli.infrastructure.output.jpa.adapter;

import com.pgm.verboseoctobroccoli.domain.model.Category;
import com.pgm.verboseoctobroccoli.domain.spi.ICategoryPersistencePort;
import com.pgm.verboseoctobroccoli.infrastructure.output.jpa.mapper.CategoryEntityMapper;
import com.pgm.verboseoctobroccoli.infrastructure.output.jpa.repository.ICategoryRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class CategoryJpaAdapter implements ICategoryPersistencePort {

    private final ICategoryRepository categoryRepository;
    private final CategoryEntityMapper categoryEntityMapper;
    @Override
    public Category saveCategory(Category category) {
        var categoryEntity = categoryRepository.save(categoryEntityMapper.toEntity(category));
        return categoryEntityMapper.toModel(categoryEntity);
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryEntityMapper.toModelList(categoryRepository.findAll());
    }
}
