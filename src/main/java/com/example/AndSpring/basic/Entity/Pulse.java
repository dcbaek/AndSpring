package com.example.AndSpring.basic.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "pulse")
@Entity
public class Pulse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pulseId;

    private String pulseData;
    private String createPul;
    private Long userId;

    public Pulse() {
    }

    public Pulse(Long pulseId, String pulseData, String createPul, Long userId) {
        this.pulseId = pulseId;
        this.pulseData = pulseData;
        this.createPul = createPul;
        this.userId = userId;
    }
}
