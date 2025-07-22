package ru.fertgl.db_connections.entities.OneToMany.library_bookCopy;

import jakarta.persistence.*;

@Entity
@Table(name = "book_copies")
public class BookCopy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String isbn;

    @Column(nullable = false)
    private String condition;

    @ManyToOne
    @JoinColumn(name = "library_id", nullable = false)
    private Library library;
}
