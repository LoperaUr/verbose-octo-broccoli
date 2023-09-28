package com.pgm.verboseoctobroccoli.application.dto.request;

import lombok.Data;

import java.util.List;

@Data
public class OrderRequest {

    private String address;
    private List<OrderItemRequest> items;

}
