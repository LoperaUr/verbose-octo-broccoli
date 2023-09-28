package com.pgm.verboseoctobroccoli.application.handler;

import com.pgm.verboseoctobroccoli.application.dto.request.OrderRequest;
import com.pgm.verboseoctobroccoli.application.dto.response.OrderResponse;
import com.pgm.verboseoctobroccoli.application.mapper.OrderRequestMapper;
import com.pgm.verboseoctobroccoli.application.mapper.OrderResponseMapper;
import com.pgm.verboseoctobroccoli.domain.api.IOrderServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class OrderHandler implements IOrderHandler {

    private final IOrderServicePort orderServicePort;
    private final OrderRequestMapper orderRequestMapper;
    private final OrderResponseMapper orderResponseMapper;

    @Override
    public OrderResponse saveOrder(OrderRequest orderRequest) {
        var order = orderServicePort.saveOrder(orderRequestMapper.toModel(orderRequest));
        return orderResponseMapper.toResponse(order);
    }
}
