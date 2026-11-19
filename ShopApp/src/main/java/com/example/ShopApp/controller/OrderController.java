package com.example.ShopApp.controller;
import com.example.ShopApp.model.Product;
import com.example.ShopApp.model.dto.OrderRequest;
import com.example.ShopApp.model.dto.OrderResponse;
import com.example.ShopApp.service.OrderService;
import com.example.ShopApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:5173")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/orders/place")
    public ResponseEntity<OrderResponse>placeOrder(@RequestBody OrderRequest orderRequest)
    {
       OrderResponse orderResponse = orderService.placeOrder(orderRequest);
       return new ResponseEntity<>(orderResponse,HttpStatus.OK);
    }
    @GetMapping("/orders")
    public ResponseEntity<List<OrderResponse>> getAllOrders()
    {
        List<OrderResponse>orderResponseList=orderService.getAllOrderResponses();
        return new ResponseEntity<>(orderResponseList,HttpStatus.OK);
    }

}
