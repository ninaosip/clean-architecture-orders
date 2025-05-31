package com.example.infrastructure.persistence;

import com.example.domain.model.Order;
import com.example.domain.model.OrderRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
public class JpaOrderRepository implements OrderRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void save(Order order) {
        entityManager.persist(order);
    }
}