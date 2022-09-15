package com.example.AndSpring.basic.service;


import com.example.AndSpring.basic.Entity.User;
import com.example.AndSpring.basic.repository.JpaUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    
    private JpaUserRepository jpaUserRepository;

    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        jpaUserRepository.findAll().forEach(e -> users.add(e));
        return users;
    }

    public Optional<User> findById(Long userId) {
        Optional<User> user = jpaUserRepository.findById(userId);
        return user;
    }

    public void deleteById(Long userId) {
        jpaUserRepository.deleteById(userId);
    }

    public User save(User user){
        jpaUserRepository.save(user);
        return user;
    }
}
