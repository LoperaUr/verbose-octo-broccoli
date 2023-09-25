package com.pgm.verboseoctobroccoli.infrastructure.input.rest;

import com.pgm.verboseoctobroccoli.application.dto.request.OrderRequest;
import com.pgm.verboseoctobroccoli.application.dto.response.OrderResponse;
import com.pgm.verboseoctobroccoli.application.handler.IOrderHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor

public class OrderController {

    private final IOrderHandler orderHandler;

    @PostMapping("/")
    public ResponseEntity<OrderResponse> saveOrder(@RequestBody OrderRequest orderRequest) {
        return new ResponseEntity<>(orderHandler.saveOrder(orderRequest), ResponseEntity.ok().build().getStatusCode());
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderResponse> getOrderById(@PathVariable Long id) {
        return new ResponseEntity<>(orderHandler.getOrderById(id), ResponseEntity.ok().build().getStatusCode());
    }

}
