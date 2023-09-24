package com.pgm.verboseoctobroccoli.infrastructure.input.rest;

import com.pgm.verboseoctobroccoli.application.dto.request.ProductRequest;
import com.pgm.verboseoctobroccoli.application.dto.response.ProductResponse;
import com.pgm.verboseoctobroccoli.application.handler.IProductHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final IProductHandler productHandler;

    @PostMapping("/")
    public ResponseEntity<ProductResponse> saveProduct(@RequestBody ProductRequest productRequest) {
        return new ResponseEntity<>(productHandler.saveProduct(productRequest), ResponseEntity.ok().build().getStatusCode());
    }

    @GetMapping("/")
    public ResponseEntity<List<ProductResponse>> getAllProducts() {
        return new ResponseEntity<>(productHandler.getAllProducts(), ResponseEntity.ok().build().getStatusCode());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductResponse> getProductById(@PathVariable Long id) {
        return new ResponseEntity<>(productHandler.getProductById(id), ResponseEntity.ok().build().getStatusCode());
    }

}
