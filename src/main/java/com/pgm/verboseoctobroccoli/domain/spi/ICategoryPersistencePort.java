package com.pgm.verboseoctobroccoli.domain.spi;

import com.pgm.verboseoctobroccoli.domain.model.Category;

import java.util.List;

public interface ICategoryPersistencePort {

    Category saveCategory(Category category);

    List<Category> getAllCategories();

}
