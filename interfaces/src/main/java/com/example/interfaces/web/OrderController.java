package com.example.interfaces.web;

import com.example.application.usecase.CreateOrderUseCase;
import com.example.domain.model.Order;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final CreateOrderUseCase useCase;

    public OrderController(CreateOrderUseCase useCase) {
        this.useCase = useCase;
    }

    @PostMapping
    public String createOrder(@RequestBody OrderRequest request) {
        Order order = new Order(request.product(), request.quantity());
        useCase.execute(order);
        return order.getId();
    }

    public record OrderRequest(String product, int quantity) {}
}