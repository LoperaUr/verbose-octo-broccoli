package com.pgm.verboseoctobroccoli.infrastructure.output.jpa.mapper;

import com.pgm.verboseoctobroccoli.domain.model.Order;
import com.pgm.verboseoctobroccoli.infrastructure.output.jpa.entity.OrderEntity;
import com.pgm.verboseoctobroccoli.infrastructure.output.jpa.entity.ProductEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface OrderEntityMapper {
    @Mapping(target = "items.product.id", source = "items.product")
    OrderEntity toEntity(Order order);

    Order toModel(OrderEntity orderEntity);

    Long map(ProductEntity productEntity);

}
