package ru.fertgl.db_connections.entities.driver_license;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "licenses")
public class License {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String licenseNumber;

    @Column(nullable = false)
    private LocalDate issuedAt;

    @OneToOne
    @JoinColumn(name = "driver_id", nullable = false)
    private Driver driver;
}