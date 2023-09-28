package com.pgm.verboseoctobroccoli.infrastructure.output.jpa.adapter;

import com.pgm.verboseoctobroccoli.domain.model.Order;
import com.pgm.verboseoctobroccoli.domain.spi.IOrderPersistencePort;
import com.pgm.verboseoctobroccoli.infrastructure.output.jpa.mapper.OrderEntityMapper;
import com.pgm.verboseoctobroccoli.infrastructure.output.jpa.repository.IOrderRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderJpaAdapter implements IOrderPersistencePort {

    private final IOrderRepository orderRepository;
    private final OrderEntityMapper orderEntityMapper;

    @Override
    public Order saveOrder(Order order) {
        var orderEntity = orderRepository.save(orderEntityMapper.toEntity(order));

        return orderEntityMapper.toModel(orderEntity);
    }
}
