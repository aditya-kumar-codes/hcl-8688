package com.example.ShopApp.model.dto;

import com.example.ShopApp.model.OrderItem;

import java.util.List;

public record OrderRequest(
        String customerName,
        String email,
        List<OrderItemRequest> items
) {
}
