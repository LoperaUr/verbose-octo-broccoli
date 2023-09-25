package com.pgm.verboseoctobroccoli.infrastructure.output.jpa.mapper;

import com.pgm.verboseoctobroccoli.domain.model.Order;
import com.pgm.verboseoctobroccoli.infrastructure.output.jpa.entity.OrderEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)

public interface OrderEntityMapper {
    OrderEntity toEntity(Order order);

    Order toModel(OrderEntity orderEntity);

}
