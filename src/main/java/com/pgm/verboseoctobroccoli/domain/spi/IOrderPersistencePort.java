package com.pgm.verboseoctobroccoli.domain.spi;

import com.pgm.verboseoctobroccoli.domain.model.Order;

public interface IOrderPersistencePort {

    Order saveOrder(Order order);

    Order getOrderById(Long id);
}
