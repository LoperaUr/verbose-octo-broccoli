package com.pgm.verboseoctobroccoli.infrastructure.output.jpa.repository;

import com.pgm.verboseoctobroccoli.infrastructure.output.jpa.entity.OrderItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderItemRepository extends JpaRepository<OrderItemEntity, Long> {
}
