package com.tnicacio.course.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnicacio.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
