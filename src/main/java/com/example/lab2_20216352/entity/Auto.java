package com.example.lab2_20216352.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


@Getter
@Setter
@Entity
@Table(name = "auto")
public class Auto {

    @Setter
    @Getter
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idauto", nullable = false)
    private Integer id;

    @Column(name="modelo", nullable = false, length = 45)
    private String modelo;

    @Column(name="color", nullable = false, length = 45)
    private String color;

    @Column(name="kilometraje", nullable = false)
    private String kilometraje;

    @Column(name="costoPorDia", nullable = false)
    private double costoPorDia;

}

