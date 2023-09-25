package com.pgm.verboseoctobroccoli.application.dto.request;

import lombok.Data;

import java.util.List;

@Data
public class OrderRequest {

    private String addressDelivery;
    private String addressBilling;
    private List<OrderItemRequest> orderItems;

}
