package com.example.AndSpring.basic.repository;

import com.example.AndSpring.basic.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaUserRepository extends JpaRepository<User, Long> {


}
