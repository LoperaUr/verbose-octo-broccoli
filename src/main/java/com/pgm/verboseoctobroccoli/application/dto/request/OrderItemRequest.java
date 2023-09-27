package com.pgm.verboseoctobroccoli.application.dto.request;

import lombok.Data;

@Data
public class OrderItemRequest {

    private Long productId;
    private int quantity;

}
