package com.example.application.usecase;

import com.example.domain.model.Order;
import com.example.domain.model.OrderRepository;

public class CreateOrderService implements CreateOrderUseCase {

    private final OrderRepository repository;

    public CreateOrderService(OrderRepository repository) {
        this.repository = repository;
    }

    @Override
    public void execute(Order order) {
        repository.save(order);
    }
}