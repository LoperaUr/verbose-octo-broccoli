package com.pgm.verboseoctobroccoli.application.dto.response;

import lombok.Data;

@Data
public class OrderItemResponse {
    private Long id;
    private Long product;
    private int quantity;

}
