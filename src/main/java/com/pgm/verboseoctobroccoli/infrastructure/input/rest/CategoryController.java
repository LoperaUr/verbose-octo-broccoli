package com.pgm.verboseoctobroccoli.infrastructure.input.rest;

import com.pgm.verboseoctobroccoli.application.dto.request.CategoryRequest;
import com.pgm.verboseoctobroccoli.application.dto.response.CategoryResponse;
import com.pgm.verboseoctobroccoli.application.handler.ICategoryHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor

public class CategoryController {

    private final ICategoryHandler categoryHandler;

    @PostMapping("/")
    public ResponseEntity<CategoryResponse> saveCategory(@RequestBody CategoryRequest categoryRequest) {
        return new ResponseEntity<>(categoryHandler.saveCategory(categoryRequest), ResponseEntity.ok().build().getStatusCode());
    }

    @GetMapping("/")
    public ResponseEntity<List<CategoryResponse>> getAllCategories() {
        return new ResponseEntity<>(categoryHandler.getAllCategories(), ResponseEntity.ok().build().getStatusCode());
    }

}
