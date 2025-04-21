package com.sunnyhsu.springbootshoppingmall.service;

import com.sunnyhsu.springbootshoppingmall.dto.CreateOrderRequest;
import com.sunnyhsu.springbootshoppingmall.dto.OrderQueryParams;
import com.sunnyhsu.springbootshoppingmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}

