package com.pgm.verboseoctobroccoli.infrastructure.output.jpa.repository;

import com.pgm.verboseoctobroccoli.infrastructure.output.jpa.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepository extends JpaRepository<OrderEntity, Long> {
}
