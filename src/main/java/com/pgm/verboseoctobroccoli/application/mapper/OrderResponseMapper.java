package com.pgm.verboseoctobroccoli.application.mapper;

import com.pgm.verboseoctobroccoli.application.dto.response.OrderResponse;
import com.pgm.verboseoctobroccoli.domain.model.Order;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface OrderResponseMapper {

    OrderResponse toResponse(Order order);
}
