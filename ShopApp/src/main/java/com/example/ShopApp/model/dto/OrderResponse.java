package com.example.ShopApp.model.dto;

import java.time.LocalDate;

public record OrderResponse(
        String orderId,
        String customerName,
        String email,
        String status,
        LocalDate orderDate,
        java.util.List<OrderItemResponse> items) {
}
