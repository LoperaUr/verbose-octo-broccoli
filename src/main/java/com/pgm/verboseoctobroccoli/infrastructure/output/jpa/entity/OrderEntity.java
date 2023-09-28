package com.pgm.verboseoctobroccoli.infrastructure.output.jpa.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Table(name = "orders")
@Data

public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String address;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItemEntity> items;

}
