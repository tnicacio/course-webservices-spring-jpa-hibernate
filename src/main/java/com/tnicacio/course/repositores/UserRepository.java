package com.tnicacio.course.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnicacio.course.entities.User;

//@Repository is not necessary, because UserRepository already extends JpaRepository
public interface UserRepository extends JpaRepository<User, Long>{

}
