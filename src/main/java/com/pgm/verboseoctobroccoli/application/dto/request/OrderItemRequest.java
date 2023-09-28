package com.pgm.verboseoctobroccoli.application.dto.request;

import lombok.Data;

@Data
public class OrderItemRequest {

    private Long product;
    private int quantity;

}
