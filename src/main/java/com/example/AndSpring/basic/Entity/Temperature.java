package com.example.AndSpring.basic.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "temperature")
@Entity
public class Temperature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long temId;

    private String temperatureData;
    private String createTem;
    private Long userId;

    public Temperature() {
    }

    public Temperature(Long temId, String temperatureData, String createTem, Long userId) {
        this.temId = temId;
        this.temperatureData = temperatureData;
        this.createTem = createTem;
        this.userId = userId;
    }
}
