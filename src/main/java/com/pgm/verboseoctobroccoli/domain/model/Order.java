package com.pgm.verboseoctobroccoli.domain.model;

import java.util.List;

public class Order {

    private Long id;
    private String addressDelivery;
    private String addressBilling;
    private List<OrderItem> orderItems;

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddressDelivery() {
        return addressDelivery;
    }

    public void setAddressDelivery(String addressDelivery) {
        this.addressDelivery = addressDelivery;
    }

    public String getAddressBilling() {
        return addressBilling;
    }

    public void setAddressBilling(String addressBilling) {
        this.addressBilling = addressBilling;
    }
}
