package com.tnicacio.course.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnicacio.course.entities.Product;

//@Repository is not necessary, because UserRepository already extends JpaRepository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
