package com.example.application.usecase;

import com.example.domain.model.Order;

public interface CreateOrderUseCase {
    void execute(Order order);
}