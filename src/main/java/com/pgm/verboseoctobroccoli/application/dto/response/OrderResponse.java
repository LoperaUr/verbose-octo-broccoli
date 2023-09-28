package com.pgm.verboseoctobroccoli.application.dto.response;

import lombok.Data;

import java.util.List;

@Data

public class OrderResponse {

    private Long id;
    private String address;
    private List<OrderItemResponse> items;

}
