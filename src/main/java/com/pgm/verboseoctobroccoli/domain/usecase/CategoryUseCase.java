package com.pgm.verboseoctobroccoli.domain.usecase;

import com.pgm.verboseoctobroccoli.domain.api.ICategoryServicePort;
import com.pgm.verboseoctobroccoli.domain.exception.InvalidNameException;
import com.pgm.verboseoctobroccoli.domain.exception.RequestBodyInvalidException;
import com.pgm.verboseoctobroccoli.domain.model.Category;
import com.pgm.verboseoctobroccoli.domain.spi.repo.CategoryRepository;
import com.pgm.verboseoctobroccoli.domain.spi.ICategoryPersistencePort;
import com.pgm.verboseoctobroccoli.domain.util.ValidateCategory;

import java.util.List;

public class CategoryUseCase implements ICategoryServicePort {

    private final ICategoryPersistencePort categoryPersistencePort;
    private final CategoryRepository categoryRepository;

    public CategoryUseCase(ICategoryPersistencePort categoryPersistencePort, CategoryRepository categoryRepository) {
        this.categoryPersistencePort = categoryPersistencePort;
        this.categoryRepository = categoryRepository;
    }


    @Override
    public Category saveCategory(Category category) {
        if (categoryRepository.existsByName(category.getName())) {
            throw new InvalidNameException();
        }

        if (ValidateCategory.isValidReqBody(category)) {
            throw new RequestBodyInvalidException();
        }
        return categoryPersistencePort.saveCategory(category);
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryPersistencePort.getAllCategories();
    }
}
