package com.example.infrastructure.persistence;

import com.example.domain.model.Order;
import com.example.domain.model.OrderRepository;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class InMemoryOrderRepository implements OrderRepository {

    private final Map<String, Order> store = new ConcurrentHashMap<>();

    @Override
    public void save(Order order) {
        store.put(order.getId(), order);
    }
}