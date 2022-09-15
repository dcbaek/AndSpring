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

    private String userName;
    private String userPassword;
    private String userBirth;
    private int userPhone;
    private String userCreate;
    private String userUpdate;
    private String authId;

    public User() {
    }

    public User(Long userId, String userName, String userPassword, String userBirth, int userPhone, String userCreate, String userUpdate, String authId) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userBirth = userBirth;
        this.userPhone = userPhone;
        this.userCreate = userCreate;
        this.userUpdate = userUpdate;
        this.authId = authId;
    }
}