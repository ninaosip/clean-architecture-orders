package com.example;

import com.example.application.usecase.CreateOrderService;
import com.example.domain.model.OrderRepository;
import com.example.infrastructure.persistence.JpaOrderRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "com.example")
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }

    @Bean
    public CreateOrderService createOrderService(OrderRepository repository) {
        return new CreateOrderService(repository);
    }
}