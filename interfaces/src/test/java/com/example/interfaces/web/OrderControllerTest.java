package com.example.interfaces.web;

import com.example.application.usecase.CreateOrderUseCase;
import com.example.domain.model.Order;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class OrderControllerTest {

    @Test
    void shouldCreateOrder() {
        CreateOrderUseCase useCase = mock(CreateOrderUseCase.class);
        OrderController controller = new OrderController(useCase);
        OrderController.OrderRequest request = new OrderController.OrderRequest("Laptop", 1);

        controller.createOrder(request);

        verify(useCase).execute(any(Order.class));
    }
}