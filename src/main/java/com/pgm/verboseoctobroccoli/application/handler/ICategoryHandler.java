package com.pgm.verboseoctobroccoli.application.handler;

import com.pgm.verboseoctobroccoli.application.dto.request.CategoryRequest;
import com.pgm.verboseoctobroccoli.application.dto.response.CategoryResponse;

import java.util.List;

public interface ICategoryHandler {

    CategoryResponse saveCategory(CategoryRequest categoryRequest);

    List<CategoryResponse> getAllCategories();

}
