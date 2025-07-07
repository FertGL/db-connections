package ru.fertgl.db_connections.entities.OneToOne;

import jakarta.persistence.*;

@Entity
public class Settings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dark_mode")
    private boolean darkMode;

    @Column(name = "language")
    private String language;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private Users users;
}
