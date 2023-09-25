package com.pgm.verboseoctobroccoli.application.dto.request;

import lombok.Data;

@Data
public class OrderItemRequest {

    private Long productId;
    private Long orderId;
    private int quantity;

}
