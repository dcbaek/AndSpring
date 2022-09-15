package com.example.AndSpring.basic.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Caregiver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long careId;

    private String createCare;
    private Long userId;

    public Caregiver() {
    }

    public Caregiver(Long careId, String createCare, Long userId) {
        this.careId = careId;
        this.createCare = createCare;
        this.userId = userId;
    }
}
