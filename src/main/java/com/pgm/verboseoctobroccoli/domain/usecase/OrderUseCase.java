package com.pgm.verboseoctobroccoli.domain.usecase;

import com.pgm.verboseoctobroccoli.domain.api.IOrderServicePort;
import com.pgm.verboseoctobroccoli.domain.model.Order;
import com.pgm.verboseoctobroccoli.domain.spi.IOrderPersistencePort;

public class OrderUseCase implements IOrderServicePort {

    private final IOrderPersistencePort orderPersistencePort;

    public OrderUseCase(IOrderPersistencePort orderPersistencePort) {
        this.orderPersistencePort = orderPersistencePort;
    }

    @Override
    public Order saveOrder(Order order) {
        return orderPersistencePort.saveOrder(order);
    }
}
