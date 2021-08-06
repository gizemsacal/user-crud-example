package com.example.usercrudexample.repository;

import com.example.usercrudexample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByAge(int age);
    User findByName(String name);
}
