package com.example.AndSpring.basic.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "bloodsugar")
@Entity
public class Bloodsugar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bloodId;

    private String bloodsugarData;
    private String createBlo;
    private Long userId;

    public Bloodsugar() {
    }

    public Bloodsugar(Long bloodId, String bloodsugarData, String createBlo, Long userId) {
        this.bloodId = bloodId;
        this.bloodsugarData = bloodsugarData;
        this.createBlo = createBlo;
        this.userId = userId;
    }
}
