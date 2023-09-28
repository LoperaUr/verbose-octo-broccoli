package com.pgm.verboseoctobroccoli.infrastructure.output.jpa.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "order_items")
@Data
public class OrderItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private ProductEntity product;

    private int quantity;

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private OrderEntity order;


}
