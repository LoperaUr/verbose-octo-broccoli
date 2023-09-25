package com.pgm.verboseoctobroccoli.domain.api;

import com.pgm.verboseoctobroccoli.domain.model.Order;

public interface IOrderServicePort {

    Order saveOrder(Order order);

    Order getOrderById(Long id);

}
