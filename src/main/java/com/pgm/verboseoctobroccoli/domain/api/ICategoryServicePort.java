package com.pgm.verboseoctobroccoli.domain.api;

import com.pgm.verboseoctobroccoli.domain.model.Category;

import java.util.List;

public interface ICategoryServicePort {
    Category saveCategory(Category category);

    List<Category> getAllCategories();

}
