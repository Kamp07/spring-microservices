package com.kampot.orderservice.repository;

import com.kampot.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * todo Document type OrderRepository
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
