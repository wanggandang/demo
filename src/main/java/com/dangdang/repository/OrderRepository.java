package com.dangdang.repository;

import com.dangdang.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderDetail,String> {

}
