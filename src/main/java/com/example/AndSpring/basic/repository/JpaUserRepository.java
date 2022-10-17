package com.example.AndSpring.basic.repository;

import com.example.AndSpring.basic.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JpaUserRepository extends JpaRepository<User, Long> {

    public List<User> findByuserId(Long userId);

    public List<User> findByUserName(String username);

}
