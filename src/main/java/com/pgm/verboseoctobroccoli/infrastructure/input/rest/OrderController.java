package com.pgm.verboseoctobroccoli.infrastructure.input.rest;

import com.pgm.verboseoctobroccoli.application.dto.request.OrderRequest;
import com.pgm.verboseoctobroccoli.application.dto.response.OrderResponse;
import com.pgm.verboseoctobroccoli.application.handler.IOrderHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final IOrderHandler orderHandler;

    @PostMapping("/")
    public ResponseEntity<OrderResponse> saveOrder (@RequestBody OrderRequest orderRequest)  {
        return new ResponseEntity<>(orderHandler.saveOrder(orderRequest), ResponseEntity.ok().build().getStatusCode());
    }
}
