package com.example.lab2_20216352.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "seguro")
public class Seguro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idseguro", nullable = false)
    private Integer id;

    @Column(name = "coberturaMaxima", nullable = false)
    private String coberturaMaxima;

    @Column(name = "empresaAseguradora", nullable = false, length = 45)
    private String empresa;

    @Column(name = "tarifa", nullable = false)
    private Double tarifa;
}
