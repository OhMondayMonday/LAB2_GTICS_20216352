package com.example.lab2_20216352.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "sedes")
public class Sede {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idsede", nullable = false)
    private Integer id;

    @Column(name = "direccion", nullable = false)
    private String direccion;

    @Column(name = "distrito", nullable = false)
    private String distrito;
}

