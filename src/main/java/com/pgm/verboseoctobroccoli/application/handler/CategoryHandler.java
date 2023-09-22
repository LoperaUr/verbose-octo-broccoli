package com.pgm.verboseoctobroccoli.application.handler;

import com.pgm.verboseoctobroccoli.application.dto.request.CategoryRequest;
import com.pgm.verboseoctobroccoli.application.dto.response.CategoryResponse;
import com.pgm.verboseoctobroccoli.application.mapper.CategoryRequestMapper;
import com.pgm.verboseoctobroccoli.domain.api.ICategoryServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class CategoryHandler implements ICategoryHandler {

    private final ICategoryServicePort categoryServicePort;
    private final CategoryRequestMapper categoryRequestMapper;


    @Override
    public CategoryResponse saveCategory(CategoryRequest categoryRequest) {

        var category = categoryServicePort.saveCategory(categoryRequestMapper.toModel(categoryRequest));
        return categoryRequestMapper.toResponse(category);
    }

    @Override
    public List<CategoryResponse> getAllCategories() {
        return categoryRequestMapper.toResponseList(categoryServicePort.getAllCategories());
    }
}
