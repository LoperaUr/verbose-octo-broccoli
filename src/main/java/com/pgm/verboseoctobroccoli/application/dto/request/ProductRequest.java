package com.pgm.verboseoctobroccoli.application.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {
    private String name;
    private String description;
    private Double price;
    private String urlImage;
    private Long stock;
    private Long category;

}
