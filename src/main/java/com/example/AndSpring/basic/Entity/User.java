package com.example.AndSpring.basic.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String username;
    private String password;
    private String userBirth;
    private int userPhone;
    private String userCreate;
    private String userUpdate;
    private String authId;

    public User() {
    }

    public User(Long userId, String username, String password, String userBirth, int userPhone, String userCreate, String userUpdate, String authId) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.userBirth = userBirth;
        this.userPhone = userPhone;
        this.userCreate = userCreate;
        this.userUpdate = userUpdate;
        this.authId = authId;
    }
}