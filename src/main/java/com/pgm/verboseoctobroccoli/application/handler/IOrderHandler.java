package com.pgm.verboseoctobroccoli.application.handler;

import com.pgm.verboseoctobroccoli.application.dto.request.OrderRequest;
import com.pgm.verboseoctobroccoli.application.dto.response.OrderResponse;

public interface IOrderHandler {
    OrderResponse saveOrder(OrderRequest orderRequest);

}
