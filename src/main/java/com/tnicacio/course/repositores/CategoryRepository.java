package com.tnicacio.course.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnicacio.course.entities.Category;

//@Repository is not necessary, because UserRepository already extends JpaRepository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
