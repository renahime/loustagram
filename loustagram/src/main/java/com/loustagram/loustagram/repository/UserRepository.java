package com.loustagram.loustagram.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loustagram.loustagram.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String username);


}
