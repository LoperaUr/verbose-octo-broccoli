package com.pgm.verboseoctobroccoli.application.dto.response;

import lombok.Data;

@Data
public class OrderItemResponse {

    private Long productId;
    private int quantity;

}
