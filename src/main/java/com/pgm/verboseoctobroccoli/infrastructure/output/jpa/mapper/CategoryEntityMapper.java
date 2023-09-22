package com.pgm.verboseoctobroccoli.infrastructure.output.jpa.mapper;

import com.pgm.verboseoctobroccoli.domain.model.Category;
import com.pgm.verboseoctobroccoli.infrastructure.output.jpa.entity.CategoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface CategoryEntityMapper {
    CategoryEntity toEntity(Category category);

    Category toModel(CategoryEntity categoryEntity);

    List<Category> toModelList(List<CategoryEntity> all);
}
