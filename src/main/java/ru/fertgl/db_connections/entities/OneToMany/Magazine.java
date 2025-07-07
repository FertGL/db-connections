package ru.fertgl.db_connections.entities.OneToMany;

import jakarta.persistence.*;

@Entity
public class Magazine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "issue_number")
    private Integer issueNumber;

    @ManyToOne
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;
}
