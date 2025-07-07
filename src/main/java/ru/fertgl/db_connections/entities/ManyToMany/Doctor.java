package ru.fertgl.db_connections.entities.ManyToMany;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "specialization")
    private String specialization;

    @ManyToMany(mappedBy = "doctors")
    private List<Hospital> hospital;
}
