package com.dangdang.service;

import com.dangdang.entity.OrderDetail;
import com.dangdang.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public void creatOrder(OrderDetail orderDetail) {
        OrderDetail save = orderRepository.save(orderDetail);
        System.out.println(save);
    }
}
