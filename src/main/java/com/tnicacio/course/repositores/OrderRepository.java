package com.tnicacio.course.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnicacio.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
