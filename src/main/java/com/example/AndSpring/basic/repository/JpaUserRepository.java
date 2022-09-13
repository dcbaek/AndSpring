package com.example.AndSpring.basic.repository;

import com.example.AndSpring.basic.domain.User;

import javax.persistence.EntityManager;

public class JpaUserRepository implements UserRepository{

    private final EntityManager em;

    public JpaUserRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public User save(User user) {
        em.persist(user);
        return user;
    }

    @Override
    public void update(Long userId, UserUpdateDto updateParam) {
        User findUser = em.find(User.class, userId);
    }


}
