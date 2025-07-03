package com.javaproject.fullstack_backend.repository;

import com.javaproject.fullstack_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
// Hear User is java class in model package and long is datatype of primary key
public interface UserRepository extends JpaRepository<User,Long>{
}
