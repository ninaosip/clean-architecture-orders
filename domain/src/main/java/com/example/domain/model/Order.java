package com.example.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Order {
    @Id
    private String id;
    private String product;
    private int quantity;

    public Order() {
        // JPA
    }

    public Order(String product, int quantity) {
        this.id = UUID.randomUUID().toString();
        this.product = product;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}