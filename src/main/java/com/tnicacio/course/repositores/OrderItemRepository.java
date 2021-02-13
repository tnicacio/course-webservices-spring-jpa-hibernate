package com.tnicacio.course.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnicacio.course.entities.OrderItem;

//@Repository is not necessary, because UserRepository already extends JpaRepository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
