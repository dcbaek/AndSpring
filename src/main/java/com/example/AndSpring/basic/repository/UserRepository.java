package com.example.AndSpring.basic.repository;

import com.example.AndSpring.basic.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {

    User save(User user);

    void update(Long userId, UserUpdateDto updateParam);

    Optional<User> findById(User id);

    List<User> findAll(UserSearchCond cond);
}
