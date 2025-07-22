package ru.fertgl.db_connections.entities.ManyToMany.teacher_classroom;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name = "teachers")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String department;

    @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TeachingAssignment> teachingAssignments = new ArrayList<>();
}

