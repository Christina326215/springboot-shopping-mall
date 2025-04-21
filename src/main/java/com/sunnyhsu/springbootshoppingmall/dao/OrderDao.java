package com.sunnyhsu.springbootshoppingmall.dao;

import com.sunnyhsu.springbootshoppingmall.dto.OrderQueryParams;
import com.sunnyhsu.springbootshoppingmall.model.Order;
import com.sunnyhsu.springbootshoppingmall.model.OrderItem;

import java.util.List;

public interface OrderDao {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    List<OrderItem> getOrderItemsByOrderId(Integer orderId);

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}
