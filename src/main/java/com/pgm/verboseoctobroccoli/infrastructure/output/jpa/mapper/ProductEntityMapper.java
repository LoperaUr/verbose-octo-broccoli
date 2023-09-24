package com.pgm.verboseoctobroccoli.infrastructure.output.jpa.mapper;

import com.pgm.verboseoctobroccoli.domain.model.Product;
import com.pgm.verboseoctobroccoli.infrastructure.output.jpa.entity.ProductEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ProductEntityMapper {

    @Mapping(target = "category.id", source = "category")
    ProductEntity toEntity(Product product);

    @Mapping(target = "category", source = "category.id")
    Product toModel(ProductEntity productEntity);

    List<Product> toModelList(List<ProductEntity> productsFounded);
}
