package com.example.ShopApp.model.dto;

import java.math.BigDecimal;

public record OrderItemRequest(
        int productId,
        int quantity
) {
}
