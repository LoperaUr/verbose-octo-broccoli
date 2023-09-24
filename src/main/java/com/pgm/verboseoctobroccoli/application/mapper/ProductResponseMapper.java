package com.pgm.verboseoctobroccoli.application.mapper;

import com.pgm.verboseoctobroccoli.application.dto.response.ProductResponse;
import com.pgm.verboseoctobroccoli.domain.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)

public interface ProductResponseMapper {
    ProductResponse toResponse(Product product);

    List<ProductResponse> toResponseList(List<Product> allProducts);
}
